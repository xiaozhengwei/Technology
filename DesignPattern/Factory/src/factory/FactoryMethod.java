package factory;

public class FactoryMethod {


}


interface ParentFactory{
    Parent create();
}

class ChildrenAFactory implements ParentFactory {
    @Override
    public Parent create() {
        return new ChildrenA();
    }
}


class ChildrenBFactory implements ParentFactory {
    @Override
    public Parent create() {
        return new ChildrenB();
    }
}


class ChildrenCFactory implements ParentFactory {
    @Override
    public Parent create() {
        return new ChildrenC();
    }
}