import java.util.ArrayList;

public class MyThread extends Thread
{

    private Object result;


    threadFace targetFunction;
    //Example
    //thread.targetFunction = () -> yourNonVoidFunction();
    //thread.targetFunction = () -> {yourVoidFunction(); return null;};

    public void run(){
        result = targetFunction.run();
    }

    public Object getResult(){
        return result;
    }

    public static boolean checkThreadStatus(ArrayList<MyThread> threadArray){
        boolean resultBool = false;
        for(MyThread thread : threadArray){
            if(thread.isAlive()){resultBool = true; break;}
        }
        return resultBool;
    }

    interface threadFace
    {
        Object run();
    }


}

