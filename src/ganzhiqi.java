/**
 * Created by novas on 16/9/30.
 */
public class ganzhiqi {
    public static void main(String[] args)
    {
        double[][] data=new double[6][2];
        data[0][0]=1;
        data[0][1]=1;
        data[1][0]=2;
        data[1][1]=2;
        data[2][0]=2;
        data[2][1]=0;
        data[3][0]=0;
        data[3][1]=0;
        data[4][0]=1;
        data[4][1]=0;
        data[5][0]=0;
        data[5][1]=1;
        double[] y=new double[data.length];
        y[0]=1;
        y[1]=1;
        y[2]=1;
        y[3]=-1;
        y[4]=-1;
        y[5]=-1;
        ganzhiqi(data,y);
    }
    public static double[] ganzhiqi(double[][] x,double[] y)
    {
        double b=1;
        double alpha=1;
        double[] w=new double[x[0].length];
        //初始化w的值，为1
        for(int i=0;i<w.length;i++)
        {
            w[i]=1;
        }
        for(int i=0;i<x.length;i++)
        {
            double[] xi=x[i];
            double sum=0;
            for(int j=0;j<xi.length;j++)
            {
                sum=sum+w[j]*xi[j];
            }
            if((sum+b)*y[i]<=0)
            {
                for(int j=0;j<w.length;j++)
                {
                    w[j]=w[j]+alpha*y[i]*xi[j];
                }
                b=b+alpha*y[i];
                i=-1;
            }
        }
        for(int i=0;i<w.length;i++)
        {
            System.out.println(w[i]);
        }
        System.out.println(b);
        return w;
    }

    /*
    public static double[] ganzhiqi(double[][] x,double[] y)
    {
        double[] w=new double[x[0].length];
        //初始化w
        for(int i=0;i<w.length;i++)
        {
            w[i]=1;
        }
        double b=1;
        double alpha=1;
        //学习的过程
        for(int i=0;i<x.length;i++)
        {
            //判断点是否是不满足的点
            double sum=0;
            for (int j=0;j<x[i].length;j++)
            {
                sum=sum+w[j]*x[i][j];
            }
            if(y[i]*(sum+b)<=0)
            {
                for(int j=0;j<w.length;j++)
                {
                    w[j]=w[j]+alpha*x[i][j]*y[i];
                }
                b=b+alpha*y[i];
                i=-1;
            }
        }
        for (int i=0;i<w.length;i++)
        {
            System.out.println(w[i]+" ");
        }
        System.out.println();
        System.out.println(b);
        return w;
    }
    */
}
