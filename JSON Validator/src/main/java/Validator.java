import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.ValidationMessage;

import java.io.File;
import java.util.Set;

public class Validator {
    public static void main(String[] args) throws Exception {
        // Print working directory for debugging
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        // Load JSON data
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonData = mapper.readTree(new File("src/main/files/data.json"));

        // Load JSON schema
        JsonNode schemaNode = mapper.readTree(new File("src/main/files/schema.json"));
        JsonSchemaFactory factory = JsonSchemaFactory.builder(JsonSchemaFactory.getInstance(com.networknt.schema.SpecVersion.VersionFlag.V7)).build();
        JsonSchema schema = factory.getSchema(schemaNode);

        // Validate JSON data against schema
        Set<ValidationMessage> errors = schema.validate(jsonData);

        if (errors.isEmpty()) {
            System.out.println("JSON is valid");
        } else {
            System.out.println("JSON is invalid:");
            for (ValidationMessage error : errors) {
                System.out.println(error.getMessage());
            }
        }
    }
}
