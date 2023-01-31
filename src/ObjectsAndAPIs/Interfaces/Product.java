package ObjectsAndAPIs.Interfaces;

public interface Product {
    //Do not have constructors
    //Fields are final
    //Must be implemented by other classes not extended

    //Constants
    //Static can be accessed from any other class without an object instantiation
    //Final Value assigned at initialization and cannot be changed
    //By convention constants are written in all caps
    String getName();
    void setName(String name);

}
