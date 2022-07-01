package Controller;

import domain.testAnswer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;

@Service
@RequiredArgsConstructor
public class testService {


    public testAnswer getResults(){

        int[] A = selection();
        int[] B = buble();
        int[] C = insertion();
        int[][] D = xy();
        int E = search();

        return new testAnswer(A,B,C,D,E);
    }
    //선택 정렬 가장 작은 값을 앞으로 보내기
    public int[] selection(){
        int temp, min;
        int[] N = {10,4,2,7,5,8};
        for(int i=0;i<N.length;i++){
            min=i;
            for(int j=i;j<N.length;j++){
                if(N[j]<N[min]){
                    min=j;
                }
            }
            temp = N[i];
            N[i] = min;
            N[min] = temp;
        }
        return N;
    }

    //버블 정렬 옆에 있는 값과 비교해서 더 작은 값을 앞으로 보내기
    public int[] buble(){
        int temp;
        int[] N = {10,4,2,7,5,8};
        for(int i=0;i<N.length;i++){
            for(int j=0;j<N.length-1-i;j++){
                if(N[j] > N[j+1]){
                    temp=N[j];
                    N[j]=N[j+1];
                    N[j+1]=temp;
                }
            }
        }
        return N;
    }
    //삽입 정렬
    public int[] insertion(){
        int temp, j;
        int[] N = {10,4,2,7,5,8};
        for(int i=1;i<N.length;i++){
            temp=N[i];
            j = i-1;
            while( (j >= 0) && (N[j] > temp) ) {
                N[j+1] = N[j];
                j--;
            }
            N[j + 1] = temp;

        }
        return N;
    }

    public int[][] xy(){
        int[][] N = {{2,6},{1,-1},{3,6},{-2,1},{1,3}};

        Arrays.sort(N, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]){
                    return Integer.compare(o1[1],o2[1]);
                }
                else {
                    return Integer.compare(o1[0],o2[0]);
                }
            }
        });

        return N;
    }

    public int search(){
        int[] N = {30, 42, 70, 35, 50};
        Arrays.sort(N);
        int max = N[0];
        int cnt = 0;
        int start = 1;

        for(int i=0;i<max;i++){
            cnt=0;
            for(int j=0;j<5;j++){
                if(start%N[j]==0)
                    cnt++;
            }
            if(cnt>=3) {break;}
            start++;
        }
        return start;
    }

}
