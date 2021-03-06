import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SetupClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            ListMaker aListMaker = (ListMaker) registry.lookup("ListMaker");
            QuizContainer quizContainer = (QuizContainer) registry.lookup("quizContainer");

            //Creates a list, list returns id
            int id = aListMaker.createList("Quiz about cats", quizContainer);
            System.out.println("Returned list ID is " + id);
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}

