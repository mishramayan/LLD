Problem Statement
You are designing a furniture shop system where customers can request different types of furniture: Chair, Table, and Sofa. Each furniture item has specific properties like material (e.g., Wood, Metal, Plastic) and dimensions. The system should be extendable to support new types of furniture in the future.


Key Points
Encapsulation of Object Creation: The FurnitureFactory encapsulates the logic for creating different furniture types.
Open/Closed Principle: The design allows adding new furniture types by creating new classes without modifying the existing factory or client code.
Scalability: New materials or dimensions can easily be accommodated by using the existing factory structure.
