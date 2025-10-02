package strategy;

public class Context{
    protected IStrategy IStrategy;

    void setStrategy(IStrategy str){
        this.IStrategy = str;
    }

    void makeStrategy(){
        IStrategy.operationStrategy();
    }
}