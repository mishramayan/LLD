import java.util.*;

interface Observer {
    void update(String message);
}

interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}

class User implements Subject {
    private final String userId;
    private String name;
    private String email;
    private List<Post> posts;
    private Set<Observer> friends;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.posts = new ArrayList<>();
        this.friends = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void createPost(String content) {
        Post post = new Post(UUID.randomUUID().toString(), this, content);
        posts.add(post);
        System.out.println(this.name + " created a post: " + content);
        notifyObservers(this.name + " created a new post: " + content);
    }

    @Override
    public void addObserver(Observer observer) {
        friends.add(observer);
        System.out.println("Added a friend to " + name + "'s friend list.");
    }

    @Override
    public void removeObserver(Observer observer) {
        friends.remove(observer);
        System.out.println("Removed a friend from " + name + "'s friend list.");
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer friend : friends) {
            friend.update(message);
        }
    }

    public void getPosts() {
        for(Post post : posts) {
            System.out.println(post.getContent().toString());
        }
    }
}

class Post {
    private final String postId;
    private final User author;
    private String content;
    private List<Comment> comments;
    private Set<User> likes;

    public Post(String postId, User author, String content) {
        this.postId = postId;
        this.author = author;
        this.content = content;
        this.comments = new ArrayList<>();
        this.likes = new HashSet<>();
    }

    public void addComment(User user, String content) {
        Comment comment = new Comment(UUID.randomUUID().toString(), user, content);
        comments.add(comment);
        System.out.println(user.getName() + " commented: " + content);
    }

    public void addLike(User user) {
        if (likes.add(user)) {
            System.out.println(user.getName() + " liked the post.");
        } else {
            System.out.println(user.getName() + " already liked the post.");
        }
    }

    public String getContent() {

        return content;
    }

    public void display() {
        System.out.println("Post by " + author.getName() + ": " + content);
        System.out.println("Likes: " + likes.size());
        System.out.println("Comments:");
        for (Comment comment : comments) {
            System.out.println(" - " + comment.getAuthor().getName() + ": " + comment.getContent());
        }
    }
}

class Comment {
    private final String commentId;
    private final User author;
    private final String content;

    public Comment(String commentId, User author, String content) {
        this.commentId = commentId;
        this.author = author;
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}

class NotificationSystem implements Observer {
    private String userName;

    public NotificationSystem(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + userName + ": " + message);
    }
}