import java.io.*;
import java.util.*;
import java.math.*;
import java.text.SimpleDateFormat;
class Traffic{
    public static int trafficpassed(double t,double []tc){
        int i=0,j=0;
        double sum=0.0;
        while(i>=0&&i<tc.length){
              if((sum+tc[i])<=t){
                ++j;
                sum+=tc[i];
              }else{
                  sum=sum;
              }
              ++i;
        }
        return j;
    }
    public static int randInt1(){
        Random rand=new Random();
        int randNum;
        randNum=rand.nextInt(2);
        return randNum;
    }
    public static double randspeed(int vehicle){
        double s=0;
        if(vehicle==6){//bus
            s=2.75;
        }
        if(vehicle==4){//car
            s=4.15;
        }
        if(vehicle==2){//auto
            s=3.45;
        }
        if(vehicle==1){//two wheeler
            s=4.85;
        }
        return s;
    }
    public static int randInt(){
        Random rand = new Random();
        int randNum;
        randNum = rand.nextInt(4)+1;
        return randNum;

    }
    public static int randIntred(int sub){
        Random rand = new Random();
        int randNum;
        randNum= rand.nextInt(sub);
        return randNum;
    }
    public static int randIntred1(int len){
        Random rand = new Random();
        int randNum;
        randNum= rand.nextInt(len);
        return randNum;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int i=0,j=0,cara=0,busa=0,autoa=0,twowheelsa=0,carst,bust,autot,twowheelst,total=0,lengthofjam,counttwo,countbus,countcar,countauto,counttwo1,countcar1,countauto1,countbus1,sublane;
        int q=0,no=4,max1=0,max=0,count=0,o=0,p=0,w=0,b=0,xc=0,sums=0;
        while(no>0){
        String street[]=new String[no];
        j=0;
        while(j<no){
            System.out.println("Enter the name of the street :"+(j+1));
            street[j]=s.nextLine();
            ++j;
            }
        InputStream is=null;
        DataInputStream dis=null;
        FileOutputStream fos=null;
        DataOutputStream dos=null;
        InputStream is2=null;
        DataInputStream dis2=null;
        FileOutputStream fos2=null;
        DataOutputStream dos2=null;
        InputStream is3=null;
        DataInputStream dis3=null;
        FileOutputStream fos3=null;
        DataOutputStream dos3=null;
        InputStream is4=null;
        DataInputStream dis4=null;
        FileOutputStream fos4=null;
        DataOutputStream dos4=null;
        while(true){
            cara=0;autoa=0;busa=0;twowheelsa=0;
            ++count;
            if(q>(no-1)){
                q=0;
            }else{
            }
            System.out.println("The street no. of q is :"+(q+1)+" and the street name is: "+street[q]);
            sublane=4;
            ++q;
            //traffic at red light
            counttwo=(int)(10*Math.random());
            countbus=(int)(10*Math.random());
            countcar=(int)(10*Math.random());
            countauto=(int)(10*Math.random());
            total=counttwo+countbus+countcar+countauto;
            //traffic at yellow light
            counttwo1=(int)(10*Math.random());
            countbus1=(int)(10*Math.random());
            countcar1=(int)(10*Math.random());
            countauto1=(int)(10*Math.random());
            total+=counttwo1+countbus1+countcar1+countauto1;
            carst=countcar+countcar1;
            bust=countbus+countbus1;
            autot=countauto+countauto1;
            twowheelst=counttwo+counttwo1;//here t stands for total traffic after the red and green lights
            int row,column,zeroes=0,vehicleremain=0;//vehicleramain gives us an idea of the no. of vehicles that are still left in the array
            System.out.println("The total no. of traffic at the crossing before green light: "+total);
            if(total%sublane==0){
                    lengthofjam=(total+vehicleremain)/sublane;
                }else{
                    lengthofjam=((total+vehicleremain)/sublane)+1;
                }
            if(q==1){
                if(count==1){

                }else{
                    try{
                        is=new FileInputStream("rate.txt");

                        dis=new DataInputStream(is);
                        o=dis.readInt();
                        System.out.println("The value of o in file 1 is as follows: "+o);
                        lengthofjam+=o;
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }
            }
            if(q==2){
                if(count==2){

                }else{
                    try{
                        is2=new FileInputStream("rate2.txt");
                        dis2=new DataInputStream(is2);
                        p=dis2.readInt();
                        System.out.println("The value of p in file 2 is as follows: "+p);
                        lengthofjam+=p;
                    }catch(Exception e){
                        System.out.println("Line 195"+e);
                    }
                }
            }
            if(q==3){
                if(count==3){

                }else{
                    try{
                        is3=new FileInputStream("rate3.txt");
                        dis3=new DataInputStream(is3);
                        w=dis3.readInt();
                        System.out.println("The value of w in file 3 is as follows: "+w);
                        lengthofjam+=w;
                    }catch(Exception e){
                        System.out.println("Line 209"+e);
                    }
                }
            }
            if(q==4){
                if(count==4){

                }else{
                    try{
                        is4=new FileInputStream("rate4.txt");
                        dis4=new DataInputStream(is4);
                        b=dis4.readInt();
                        System.out.println("The value of b in file 4 is as follows: "+b);
                        lengthofjam+=b;
                    }catch(Exception e){
                        System.out.println("Line 233"+e);
                    }
                }
            }
            System.out.println("The total no of rows needed for the traffic are: "+lengthofjam);
            if(q==1){
                File file=new File("rate.txt");
                FileOutputStream foss=null;
                DataOutputStream doss=null;
                InputStream iss=null;
                DataInputStream diss=null;
            }else if(q==2){
                File file2=new File("rate2.txt");
                FileOutputStream foss2=null;
                DataOutputStream doss2=null;
                InputStream iss2=null;
                DataInputStream diss2=null;
            }else if(q==3){
                File file3=new File("rate3.txt");
                FileOutputStream foss3=null;
                DataOutputStream doss3=null;
                InputStream iss3=null;
                DataInputStream diss3=null;
            }else if(q==4){
                File file4=new File("rate4.txt");
                FileOutputStream foss4=null;
                DataOutputStream doss4=null;
                InputStream iss4=null;
                DataInputStream diss4=null;
            }
            int k=0,m;
            int [][]traffic=new int[lengthofjam][sublane];
           if(count>1&&q==1&&o!=0){
                try{
                    FileReader fr=new FileReader("A.txt");
                    BufferedReader br=new BufferedReader(fr);
                    int check=0;
                    i=0;
                    while(i>=0&&i<o){
                        j=0;
                        while(j>=0&&j<sublane){
                            traffic[i][j]=Integer.parseInt(br.readLine());
                            if(traffic[i][j]==1||traffic[i][j]==2||traffic[i][j]==4||traffic[i][j]==6){
                                ++vehicleremain;
                            }else{

                            }
                            ++j;
                        }
                        i++;
                    }
                    br.close();
                }catch(Exception e){
                    System.out.println("Line 298"+e);
                }
            }else if(count>2&&q==2&&p!=0){
                try{
                    FileReader fr=new FileReader("B.txt");
                    BufferedReader br=new BufferedReader(fr);
                    int check=0;
                    i=0;
                    while(i>=0&&i<p){
                        j=0;
                        while(j>=0&&j<sublane){
                            traffic[i][j]=Integer.parseInt(br.readLine());
                            if(traffic[i][j]==1||traffic[i][j]==2||traffic[i][j]==4||traffic[i][j]==6){
                                ++vehicleremain;
                            }else{

                            }
                            ++j;
                        }
                        i++;
                    }
                    br.close();
                }catch(Exception e){
                    System.out.println("Line 325"+e);
                }
            }else if(count>3&&q==3&&w!=0){
                try{
                    FileReader fr=new FileReader("C.txt");
                    BufferedReader br=new BufferedReader(fr);
                    int check=0;
                    i=0;
                    while(i>=0&&i<w){
                        j=0;
                        while(j>=0&&j<sublane){
                            traffic[i][j]=Integer.parseInt(br.readLine());
                            if(traffic[i][j]==1||traffic[i][j]==2||traffic[i][j]==4||traffic[i][j]==6){
                                ++vehicleremain;
                            }else{

                            }
                            ++j;
                        }
                        i++;
                    }
                    br.close();
                }catch(Exception e){
                    System.out.println("Line 352"+e);
                }
            }else if(count>4&&q==4&&b!=0){
                try{
                    FileReader fr=new FileReader("D.txt");
                    BufferedReader br=new BufferedReader(fr);
                    int check=0;
                    i=0;
                    while(i>=0&&i<b){
                        j=0;
                        while(j>=0&&j<sublane){
                            traffic[i][j]=Integer.parseInt(br.readLine());
                            if(traffic[i][j]==1||traffic[i][j]==2||traffic[i][j]==4||traffic[i][j]==6){
                                ++vehicleremain;
                            }else{

                            }
                            ++j;
                        }
                        i++;
                    }
                    br.close();
                }catch(Exception e){
                    System.out.println("Line 379"+e);
                }
            }
            zeroes=(lengthofjam*sublane)-total-vehicleremain;
            if(vehicleremain>0){
            i=0;
            while(i>=0&&i<lengthofjam){
                j=0;
                while(j>=0&&j<sublane){
                    System.out.print(traffic[i][j]+"\t");
                    ++j;
                }
                System.out.println();
                ++i;
                }
            }
            i=0;
            if(zeroes/sublane>0){
                lengthofjam-=zeroes/sublane;
                zeroes=zeroes%sublane;
            }else{

            }
            System.out.println("The no of extra spaces in the street are:"+zeroes);
            while(k<zeroes){
                do{
                    m=randIntred1(sublane);
                    }while(traffic[lengthofjam-1][m]!=0);
                traffic[lengthofjam-1][m]=5;
                ++k;
            }
            i=0;
            while(i>=0&&i<carst){
                do{
                    row= randIntred1(lengthofjam);
                    column= randIntred(sublane);
                }while(traffic[row][column]!=0);
                traffic[row][column]=4;
            ++i;
            }
            i=0;
            while(i>=0&&i<bust){
                do{
                    row= randIntred1(lengthofjam);
                    column= randIntred(sublane);
                }while(traffic[row][column]!=0);
                traffic[row][column]=6;
            ++i;
            }
            i=0;
            while(i>=0&&i<autot){
                do{
                    row= randIntred1(lengthofjam);
                    column= randIntred(sublane);
                }while(traffic[row][column]!=0);
                traffic[row][column]=2;
            ++i;
            }
            i=0;
            while(i>=0&&i<twowheelst){
                do{
                    row= randIntred1(lengthofjam);
                    column= randIntred(sublane);
                }while(traffic[row][column]!=0);
                traffic[row][column]=1;
            ++i;
            }
            i=0;
            while(i>=0&&i<lengthofjam){
                j=0;
                while(j>=0&&j<sublane){
                    if(traffic[i][j]==5){
                        System.out.print(0+"\t");
                    }else{
                        System.out.print(traffic[i][j]+"\t");
                    }
                    ++j;
                }
                System.out.println();
                ++i;
            }
            double speed[][]=new double[lengthofjam][sublane];
            double [][]speeed=new double[lengthofjam][sublane];
            double [][]time=new double[lengthofjam][sublane];
            //int [][]distance=new int[lengthofjam][sublane];
            //System.out.println("The traffic at the street is arranged as follows:");
            int l=0,dist;
            String dirs[]=new String[3];
            String [][]dir=new String[lengthofjam][sublane];
            dirs[0]="s";
            dirs[1]="r";
            dirs[2]="l";
            System.out.println("The direction in which the traffic is moving is as follows: ");
            i=0;
            while(i>=0&&i<lengthofjam){
                j=0;
                while(j>=0&&j<sublane){
                    //new line being added
                    if(traffic[i][j]==5){
                        dir[i][j]=null;
                    }else if(j==0){
                        dir[i][j]=dirs[2];
                    }else if(j==(sublane-1)){
                        dir[i][j]=dirs[1];
                    }else if(j==1){
                        dir[i][j]=dirs[0];
                    }else{
                        k=randInt1();
                        dir[i][j]=dirs[k];
                    }
                    System.out.print(dir[i][j]+"\t");
                    ++j;
                }
                System.out.println();
                ++i;
            }
            int distance[][]=new int[lengthofjam][sublane];
            i=0;
            while(i>=0&&i<lengthofjam){
                j=0;
                while(j>=0&&j<sublane){
                    speed[i][j]=randspeed(traffic[i][j]);
                    ++j;
                }
                ++i;
            }
            i=0;
            while(i>=0&&i<lengthofjam){
                j=0;
                while(j>=0&&j<sublane){
                    if(speed[i][j]==0){
                        distance[i][j]=0;
                    }else if(traffic[i][j]!=5&&(dir[i][j].equals("l")||dir[i][j].equals("r"))){
                        distance[i][j]=2;
                    }else if(traffic[i][j]!=5&&(dir[i][j].equals("s"))){
                        distance[i][j]=4;
                    }
                    ++j;
                }
                ++i;
            }
            System.out.println("The initial speed for the vehicles are arranged in the following array as follows:");
            i=0;
            while(i>=0&&i<lengthofjam){
                j=0;
                while(j>=0&&j<sublane){
                    System.out.print(speed[i][j]+"\t");
                    ++j;
                }
                System.out.println();
                ++i;
            }

            j=0;
            while(j>=0&&j<sublane){
                i=0;
                while(i>=0&&i<lengthofjam){
                    if(traffic[i][j]!=0||traffic[i][j]!=5){
                            sums=0;
                            xc=i;
                            while(xc>=0){
                                sums+=traffic[xc][j];
                                --xc;
                            }
                            distance[i][j]+=sums;


                    }else{
                        distance[i][j]=0;
                    }
                    ++i;
                }
                ++j;
            }
            System.out.println("The updated distance that the vehicle needs to cover is as follows: ");
            i=0;
            while(i>=0&&i<lengthofjam){
                j=0;
                while(j>=0&&j<sublane){
                    if(speed[i][j]==0){
                        distance[i][j]=0;
                    }
                    if(i==0){
                        distance[i][j]=distance[i][j];
                    }
                    if(j==2){
                        if(speed[i][j]!=0&&dir[i][j].equals("r")){
                            distance[i][j]+=3;
                        }else{

                        }
                    }
                    if((j==3||j==0)&&speed[i][j]!=0){
                        distance[i][j]+=1;
                    }
                    System.out.print(distance[i][j]+"\t");
                    ++j;
                }
                System.out.println();
                ++i;
            }
            j=0;
            while(j>=0&&j<sublane){
                i=0;
                while(i>=0&&i<lengthofjam){
                        if(i==0){
                            speeed[i][j]=speed[i][j];
                        }else if(speeed[i-1][j]<=speed[i][j]){
                            speeed[i][j]=speeed[i-1][j];
                        }else if(speeed[i-1][j]>speed[i][j]){
                            speeed[i][j]=speed[i][j];
                        }
                    i++;
                    }
                j++;
            }
            i=0;
            System.out.println("The actual speed with which the vehicles are crossing the road is as follows:");
            while(i>=0&&i<lengthofjam){
                j=0;
                while(j>=0&&j<sublane){
                    System.out.print(speeed[i][j]+"\t");
                    ++j;
                }
                ++i;
                System.out.println();
            }
            System.out.println("The time required by each of the vehicles to cross the road is:");
            double [][]timee=new double[lengthofjam][sublane];
            i=0;
            while(i>=0&&i<lengthofjam){
                j=0;
                while(j>=0&&j<sublane){
                    if(speed[i][j]==0){
                        timee[i][j]=0.0;
                        System.out.print(timee[i][j]+"\t");
                        ++j;
                        continue;
                    }
                    if(i==0){
                        timee[i][j]=(double)distance[i][j]/speeed[i][j];
                    }
                    if(j==2&&i!=0){
                        if(dir[i-1][j].equals(dir[i][j])&&speeed[i-1][j]==speeed[i][j]){
                            timee[i][j]=(double)timee[i-1][j]+(double)traffic[i][j]/speeed[i][j];
                        }else if(dir[i-1][j].equals(dir[i][j])&&(speeed[i-1][j]!=speeed[i][j])){
                            timee[i][j]=(double)distance[i][j]/speeed[i][j];
                        }else if(dir[i-1][j].equals("s")&&dir[i][j].equals("r")){
                            sums=0;
                            xc=i-1;
                            while(xc>=0){
                                sums+=traffic[xc][j];
                                --xc;
                            }
                            timee[i][j]=(double)((sums+2)/speeed[i][j])+(double)(traffic[i][j]+3)/speed[i][j];
                        }else if(dir[i-1][j].equals("r")&&dir[i][j].equals("s")){
                            sums=0;
                            xc=i-1;
                            while(xc>=0){
                                sums+=traffic[xc][j];
                                --xc;
                            }
                            timee[i][j]=(double)((sums+2)/speeed[i][j])+(double)(traffic[i][j]+2)/speed[i][j];
                        }
                    }else{
                        timee[i][j]=(double)distance[i][j]/speeed[i][j];
                    }
                    timee[i][j]*=100;
                    timee[i][j]=Math.round(timee[i][j]);
                    timee[i][j]/=100;
                    System.out.print(timee[i][j]+"\t");
                    ++j;
                }
                System.out.println();
                ++i;
            }
            System.out.print("The light turns green at: ");
            SimpleDateFormat foo1=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date1=new Date();
            System.out.println(foo1.format(date1));
            System.out.println("Light:Green");
            double tim;
            double timea=0.0;
            double maximum=0.0;
            int count1=0;
            j=0;
            while(j>=0&&j<sublane){
                ++count1;
                timea=0.0;
                i=0;
                while(i>=0&&i<lengthofjam){
                    timea+=timee[i][j];
                    i++;
                }
                if(count1==1){
                    maximum=timea;
                }else{
                    if(timea>maximum){
                        maximum=timea;
                    }else{
                        maximum=maximum;
                    }
                }
                ++j;
            }
            if(maximum<45.0||maximum<60.0||maximum<70){
                    tim=maximum;
            }else if(lengthofjam>6&&lengthofjam<12){
                tim=50.0;
            }else if(lengthofjam<15){
                tim=60.0;
            }else if(lengthofjam>15&&lengthofjam<20){
                tim=70.0;
            }else{
                tim=90.0;
            }

            System.out.println("The time for which the light turns green is: "+tim);
            i=(int)tim*1000;
            try{
                Thread.sleep(i);
            }catch(Exception e){
                System.out.println(e);
            }
            int ze;
            double []timec=new double[lengthofjam];
            int []passed=new int[lengthofjam];
            j=0;
            while(j>=0&&j<sublane){
                ze=0;
                i=0;
                while(i>=0&&i<lengthofjam){
                    timec[i]=timee[i][j];
                    if(timec[i]==0.0){
                        ++ze;
                    }
                    ++i;
                }
                int passing=trafficpassed(tim,timec);
                passed[j]=passing;
                int f=lengthofjam-passed[j];
                if(j==0){
                    max=f;
                }
                if(j>0&&f>max){
                    max=f;
                }
                int remain=lengthofjam-passed[j];
                if(remain>0&&ze>0){
                    remain-=ze;
                }else{

                }
                System.out.println("The remaining no of vehicles in a particular column are as follows:"+remain);
                ++j;
            }
            int[][] trafficnew=new int[lengthofjam][sublane];
            i=0;k=0;int t=0;
            j=0;int h,f;
            while(j>=0&&j<sublane){
                i=0;
                while(i>=0&&i<lengthofjam){
                    h=0+passed[j];
                    while(h>=0+passed[j]&&h<lengthofjam){
                        trafficnew[h][j]=0;
                        ++h;
                    }
                    f=0+passed[j];
                    h=0;
                    while(h>=0&&h<lengthofjam-passed[j]){
                        trafficnew[h][j]=traffic[f][j];
                        ++f;
                        ++h;
                    }
                    ++i;
                }
                ++j;
            }
            int coun=0;
            double timeagain=0.0;
            if(max==1){
                i=0;
                while(i>=0&&i<max){
                    ++coun;
                    j=0;
                    sums=0;
                    xc=lengthofjam-2;
                    while(xc>=0){
                        sums+=traffic[xc][j];
                        --xc;
                    }
                    while(j>=0&&j<sublane){
                        if(coun==1){
                            timeagain=timee[lengthofjam-1][j]-(double)(sums/speeed[lengthofjam-1][j]);
                        }else{
                            if(timeagain<timee[lengthofjam-1][j]){
                                timeagain=timee[lengthofjam-1][j]-(double)(sums/speeed[lengthofjam-1][j]);
                            }else{
                                timeagain=timeagain;
                            }
                        }
                        ++j;
                    }
                    ++i;
                }
            i=(int)timeagain*1000;
            try{
                Thread.sleep(i);
            }catch(Exception e){
                System.out.println(e);
            }
            if(max==1){
                i=0;
                while(i>=0&&i<max){
                    j=0;
                    while(j>=0&&j<sublane){
                        trafficnew[i][j]=0;
                        ++j;
                    }
                    ++i;
                }
            }
                max1=max;
                --max;
                System.out.println("The time has been extended");
                tim+=timeagain;
            }
            System.out.println("The array after the traffic has moved on:");
            i=0;
            while(i>=0&&i<lengthofjam){
                j=0;
                while(j>=0&&j<sublane){
                    if(trafficnew[i][j]==5){
                        trafficnew[i][j]=0;
                        System.out.print(0+"\t");
                    }else{
                        System.out.print(trafficnew[i][j]+"\t");
                    }
                    if(trafficnew[i][j]==6){
                        ++busa;
                    }else if(trafficnew[i][j]==4){
                        ++cara;
                    }else if(trafficnew[i][j]==2){
                        ++autoa;
                    }else if(trafficnew[i][j]==1){
                        ++twowheelsa;
                    }
                    ++j;
                }
                System.out.println();
                ++i;
            }
            if(count>=1&&q==1){
                    try{
                    FileWriter fw=new FileWriter("A.txt");
                    BufferedWriter bw=new BufferedWriter(fw);
                    i=0;
                    while(i>=0&&i<max){
                        j=0;
                        while(j>=0&&j<sublane){
                            int y=trafficnew[i][j];
                            bw.write(Integer.toString(y));
                            bw.newLine();
                            ++j;
                        }
                        ++i;
                    }
                    bw.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    try{
                        fos=new FileOutputStream("rate.txt");
                        dos=new DataOutputStream(fos);
                        int x=max;
                        dos.writeInt(x);
                        dos.flush();
                        }catch(Exception e){
                            System.out.println("There is an error found in the file hence the program cannot be executed further");
                    }
                }
                if(count>=2&&q==2){
                    try{
                    FileWriter fw2=new FileWriter("B.txt");
                    BufferedWriter bw2=new BufferedWriter(fw2);
                    i=0;
                    while(i>=0&&i<max){
                        j=0;
                        while(j>=0&&j<sublane){
                            int y=trafficnew[i][j];
                            bw2.write(Integer.toString(y));
                            bw2.newLine();
                            ++j;
                        }
                    ++i;
                    }
                    bw2.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    try{
                        fos2=new FileOutputStream("rate2.txt");
                        dos2=new DataOutputStream(fos2);
                        int x=max;
                        dos2.writeInt(x);
                        dos2.flush();
                        }catch(Exception e){
                            System.out.println("There is an error found in the file hence the program cannot be executed further");
                    }
                }
                if(count>=3&&q==3){
                    try{
                    FileWriter fw3=new FileWriter("C.txt");
                    BufferedWriter bw3=new BufferedWriter(fw3);
                    i=0;
                    while(i>=0&&i<max){
                        j=0;
                        while(j>=0&&j<sublane){
                            int y=trafficnew[i][j];
                            bw3.write(Integer.toString(y));
                            bw3.newLine();
                            ++j;
                        }
                        ++i;
                    }
                    bw3.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    try{
                        fos3=new FileOutputStream("rate3.txt");
                        dos3=new DataOutputStream(fos3);
                        int x=max;
                        dos3.writeInt(x);
                        dos3.flush();
                        }catch(Exception e){
                            System.out.println("There is an error found in the file hence the program cannot be executed further");
                    }
                }
                if(count>=4&&q==4){
                    try{
                    FileWriter fw4=new FileWriter("D.txt");
                    BufferedWriter bw4=new BufferedWriter(fw4);
                    i=0;
                    while(i>=0&&i<max){
                        j=0;
                        while(j>=0&&j<sublane){
                            int y=trafficnew[i][j];
                            bw4.write(Integer.toString(y));
                            bw4.newLine();
                            ++j;
                        }
                        ++i;
                    }
                    bw4.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    try{
                        fos4=new FileOutputStream("rate4.txt");
                        dos4=new DataOutputStream(fos4);
                        int x=max;
                        dos4.writeInt(x);
                        dos4.flush();
                        }catch(Exception e){
                            System.out.println("There is an error found in the file hence the program cannot be executed further");
                    }
                }
                System.out.println("The maximum no. of rows that need to be retained from the original array are: "+max);
                System.out.println("No. of buses left after the signal has gone red again: "+busa);
                System.out.println("No. of cars left after the signal has gone red again: "+cara);
                System.out.println("No. of two wheelers left after the signal has gone red again: "+twowheelsa);
                System.out.println("No. of autos left after the signal has gone red again: "+autoa);
                if(q==1){
                    try{
                        FileWriter fw=new FileWriter("Datas1.txt",true);
                        BufferedWriter bw=new BufferedWriter(fw);
                        bw.write("The date at which the reading was taken and the time at which the traffic light turned green: ");
                        bw.write(foo1.format(date1));
                        bw.newLine();
                        bw.write("The time for which the traffic light turns green is: ");
                        bw.write(tim+" seconds");
                        bw.newLine();
                        if(max1==1){
                            bw.write("The time for the green light was extended");
                            bw.newLine();
                        }
                        bw.write("No. of buses left after the signal has gone red again: ");
                        bw.write(Integer.toString(busa));
                        bw.newLine();
                        bw.write("No. of cars left after the signal has gone red again: ");
                        bw.write(Integer.toString(cara));
                        bw.newLine();
                        bw.write("No. of two wheelers left after the signal has gone red again: ");
                        bw.write(Integer.toString(twowheelsa));
                        bw.newLine();
                        bw.write("No. of autos left after the signal has gone red again: ");
                        bw.write(Integer.toString(autoa));
                        bw.newLine();
                        bw.newLine();
                        bw.newLine();
                        bw.close();
                    }catch(Exception e){
                        System.out.println(e);
                        }
                    }
                    if(q==2){
                    try{
                        FileWriter fw2=new FileWriter("Datas2.txt",true);
                        BufferedWriter bw2=new BufferedWriter(fw2);
                        bw2.write("The date at which the reading was taken and the time at which the traffic light turned green: ");
                        bw2.write(foo1.format(date1));
                        bw2.newLine();
                        bw2.write("The time for which the traffic light turns green is: ");
                        bw2.write(tim+" seconds");
                        bw2.newLine();
                        if(max1==1){
                            bw2.write("The time for the green light was extended");
                            bw2.newLine();
                        }
                        bw2.write("No. of buses left after the signal has gone red again: ");
                        bw2.write(Integer.toString(busa));
                        bw2.newLine();
                        bw2.write("No. of cars left after the signal has gone red again: ");
                        bw2.write(Integer.toString(cara));
                        bw2.newLine();
                        bw2.write("No. of two wheelers left after the signal has gone red again: ");
                        bw2.write(Integer.toString(twowheelsa));
                        bw2.newLine();
                        bw2.write("No. of autos left after the signal has gone red again: ");
                        bw2.write(Integer.toString(autoa));
                        bw2.newLine();
                        bw2.newLine();
                        bw2.newLine();
                        bw2.close();
                    }catch(Exception e){
                        System.out.println(e);
                        }
                    }
                    if(q==3){
                    try{
                        FileWriter fw3=new FileWriter("Datas3.txt",true);
                        BufferedWriter bw3=new BufferedWriter(fw3);
                        bw3.write("The date at which the reading was taken and the time at which the traffic light turned green: ");
                        bw3.write(foo1.format(date1));
                        bw3.newLine();
                        bw3.write("The time for which the traffic light turns green is: ");
                        bw3.write(tim+" seconds");
                        bw3.newLine();
                        if(max1==1){
                            bw3.write("The time for the green light was extended");
                            bw3.newLine();
                        }
                        bw3.write("No. of buses left after the signal has gone red again: ");
                        bw3.write(Integer.toString(busa));
                        bw3.newLine();
                        bw3.write("No. of cars left after the signal has gone red again: ");
                        bw3.write(Integer.toString(cara));
                        bw3.newLine();
                        bw3.write("No. of two wheelers left after the signal has gone red again: ");
                        bw3.write(Integer.toString(twowheelsa));
                        bw3.newLine();
                        bw3.write("No. of autos left after the signal has gone red again: ");
                        bw3.write(Integer.toString(autoa));
                        bw3.newLine();
                        bw3.newLine();
                        bw3.newLine();
                        bw3.close();
                    }catch(Exception e){
                        System.out.println(e);
                        }
                    }
                    if(q==4){
                    try{
                        FileWriter fw4=new FileWriter("Datas4.txt",true);
                        BufferedWriter bw4=new BufferedWriter(fw4);
                        bw4.write("The date at which the reading was taken and the time at which the traffic light turned green: ");
                        bw4.write(foo1.format(date1));
                        bw4.newLine();
                        bw4.write("The time for which the traffic light turns green is: ");
                        bw4.write(tim+" seconds");
                        bw4.newLine();
                        if(max1==1){
                            bw4.write("The time for the green light was extended");
                            bw4.newLine();
                        }
                        bw4.write("No. of buses left after the signal has gone red again: ");
                        bw4.write(Integer.toString(busa));
                        bw4.newLine();
                        bw4.write("No. of cars left after the signal has gone red again: ");
                        bw4.write(Integer.toString(cara));
                        bw4.newLine();
                        bw4.write("No. of two wheelers left after the signal has gone red again: ");
                        bw4.write(Integer.toString(twowheelsa));
                        bw4.newLine();
                        bw4.write("No. of autos left after the signal has gone red again: ");
                        bw4.write(Integer.toString(autoa));
                        bw4.newLine();
                        bw4.newLine();
                        bw4.newLine();
                        bw4.close();
                    }catch(Exception e){
                        System.out.println(e);
                        }
                    }
                }
            }
        }
    }
