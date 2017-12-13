# Hibernate_Inheritance_Mapping_Table_Per_Class_Hierarchy_Using_DAO_Using_Maven
 We can map the inheritance hierarchy classes with the table of the database.
 There are three inheritance mapping strategies defined in the hibernate:  
         1.Table Per Hierarchy 
         2.Table Per Concrete class 
         3.Table Per Subclass
         
# 1.Table Per Hierarchy         
In table per hierarchy mapping, single table is required to map the whole hierarchy, an extra column (known as discriminator column) is added to identify the class. But nullable values are stored in the table .
  We can write in two ways
           a)Table Per Hierarchy using xml file
           b)Table Per Hierarchy using Annotation
  
  # 2.Table Per Concrete class
In case of table per concrete class, tables are created as per class. But duplicate column is added in subclass tables.
  We can write in two ways
           a)Table Per Hierarchy using xml file
           b)Table Per Hierarchy using Annotation
   # 3.Table Per Subclass
In this strategy, tables are created as per class but related by foreign key. So there are no duplicate columns.
  We can write in two ways
           a)Table Per Hierarchy using xml file
           b)Table Per Hierarchy using Annotation
