<h2>Problem Statement</h2>
<p>You are designing a furniture shop system where customers can request different types of furniture: Chair, Table, and Sofa. Each furniture item has specific properties like material (e.g., Wood, Metal, Plastic) and dimensions. The system should be extendable to support new types of furniture in the future.</p>


<h4>Key Points</h4>
<li><b>Encapsulation of Object Creation:</b> The FurnitureFactory encapsulates the logic for creating different furniture types.</li>
<li><b>Open/Closed Principle:</b> The design allows adding new furniture types by creating new classes without modifying the existing factory or client code.</li>
<li><b>Scalability:</b> New materials or dimensions can easily be accommodated by using the existing factory structure.</li>
