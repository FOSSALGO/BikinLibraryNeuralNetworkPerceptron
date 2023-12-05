package fosalgo;

import java.io.File;

public class MainClass {
    public static void main(String[] args) {
        Perceptron perceptron = new Perceptron();
        File fileDataTraining = new File("src/fosalgo/dataset.txt");//file data training
        //KONSTANTA
        double alpha = 0.05;//digunakan untuk meng-update bobot atau weight
        double theta = 0.5;//digunakan untuk fungsi aktivasi
        String hasilTraining = perceptron.training(fileDataTraining, alpha, theta);
        System.out.println("TRAINING ===========================================");
        System.out.println(hasilTraining);
        
        
        
        File fileTesting = new File("src/fosalgo/datatesting.txt");
        String hasilTesting = perceptron.testing(fileTesting);
        System.out.println("TESTING ============================================");
        System.out.println(hasilTesting);
    }
}
