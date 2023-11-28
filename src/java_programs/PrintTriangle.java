package java_programs;

//*****
//****
//***
//**
//*
public class PrintTriangle {
    public static void main(String[] args){
        int n = 6;
        for(int i = 0; i<n;i++){
            for(int j = i+1; j<n;j++){
            System.out.print("*");
            }
            System.out.println("");
        }
    }
}
