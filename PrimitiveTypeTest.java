/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivetypetest;

/**
 *
 * @author cjh
 */

import com.matrix.*;
import com.matrix.matrix.*;

import java.util.*;
import java.text.* ; 
import java.awt.Color; 
import java.awt.BasicStroke; 
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.xy.XYDataset; 
import org.jfree.data.xy.XYSeries; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 
import org.jfree.chart.plot.XYPlot; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.xy.XYSeriesCollection; 
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtchart.Chart;
import org.eclipse.swtchart.ILineSeries;
import org.eclipse.swtchart.ISeries.SeriesType;
import Jama.Matrix;
import Jama.SingularValueDecomposition;
import java.text.SimpleDateFormat;
//import org.apache.commons.lang;


class PrimitiveTypeTest 
{  
    //public static  double[][] input_A=new double[][]{{1.9, 2.4},{3.4, 3.5}};
//    public static   double[][] input_A=new double[][]{{1, 22, 34,22}, 
//				   {1, 11,5,21} ,
//				   {0,1,5,11},
//				   {7,2,13,19}};
//    public static double[][] input_B=new double[][]{{1.9, 2.4},{3.4, 3.5}};
    
    public static void main(String[] args)   
    { 
        
        
        //double[][] cc=null;
        
        matrix cc=new matrix();
       
        
        
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(4); 
        
          double[][] input_AA={{1, 22, 34,22}, 
				   {1, 11,5,21} ,
				   {0,1,5,11},
				   {7,2,13,19}};
          //double[][] c1=null;
          double[][] c1=cc.add_matrix(input_AA, input_AA);
          cc.print_matrix(c1);
          System.out.println("_______________________________________");
        
          double[][] xx=new double[][]{{0.1,0.15},{0.3,0.45}};
          double[] xx2=new double[]{0.1,0.15};
          double[] c2=cc.trml_matrix_1(xx,xx2);
          cc.print_matrix(c2);
          System.out.println("_______________________________________");
          input_AA=new double[][]{{1, 22, 34,22},{1, 11,5,21} ,{0,1,5,11},{7,2,13,19}};
          cc.print_matrix(cc.trml_matrix(input_AA,input_AA));
          System.out.println("_______________________________________");
        
          input_AA=new double[][]{{1, 22, 34,22}, 
				   {1, 11,5,21} ,
				   {0,1,5,11},
				   {7,2,13,19}};
          inv_matrix c3=cc.new inv_matrix();
          cc.print_matrix(c3.inv_matrix(input_AA));
          System.out.println("——————————————————————————————————");
          
        
        input_AA=new double[][]{{1, 22, 34,22}, 
				   {1, 11,5,21} ,
				   {0,1,5,11},
				   {7,2,13,19}};
        det_matrix c4=cc.new det_matrix();
        System.out.println(Double.toString(c4.det_matrix(input_AA)));
        System.out.println("——————————————————————————————————");
        
        
        input_AA=new double[][]{{13, 12, 0, 0,0},{11 ,10 ,9, 0,0},{0 ,8 ,7 ,6,0},{0, 0, 5, 4,3},{0, 0, 0, 2,1}};
        rank_matrix c5=cc.new rank_matrix();
        System.out.println(Double.toString(c5.rank_matrix(input_AA)));
        System.out.println("——————————————————————————————————");
        
        input_AA=new double[][]{{2, 4, 4, 2},{3 ,3 ,12, 6},{2 ,4 ,-1 ,2},{4, 2, 1, 1}};
        LU_matrix c6=cc.new LU_matrix(input_AA);
        c6.LU_matrix(input_AA);
        double[][] L=c6.L;
        double[][] U=c6.U;
        cc.print_matrix(L);
        System.out.println("_______________________________________");
        cc.print_matrix(U);
        System.out.println("_______________________________________");
        
        input_AA=new double[][]{{3,9,7},{2,8,3},{2,1,5},{6,7,10},{2,5,9}};
        QR_matrix c7=cc.new QR_matrix(input_AA);
        c7.QR_matrix(input_AA);
        cc.print_matrix(c7.Q);
        System.out.println("_______________________________________");
        cc.print_matrix(c7.R);
        System.out.println("_______________________________________");
        
        input_AA=new double[][]{{0.2368, 0.2471, 0.2568, 1.2671},{0.1968 ,0.2071 ,1.2168,0.2271},{0.1568 ,1.1675,0.1768 ,0.1871},{1.1161,0.1254, 0.1397, 0.1490}};
        double[] input_BB=new double[]{1.8471,1.7471,1.6471,1.5471};
        Gauss_Slove c9=cc.new Gauss_Slove();
        cc.print_matrix(c9.Gauss_Slove(input_AA,input_BB));
        System.out.println("_______________________________________");
        
        input_AA=new double[][]{{1, 6, -3, -1,7},{8 ,-15 ,18, 5,4},{-2 ,11 ,9 ,15,20},{-13, 2, 21, 30,-6},{17, 22, -5,3,6}};
        HH_matrix c10=cc.new HH_matrix();
      
        cc.print_matrix(c10.HH_matrix(input_AA));
        System.out.println("_______________________________________");
        
        input_AA=new double[][]{{1, 6, -3, -1,7},{8 ,-15 ,18, 5,4},{-2 ,11 ,9 ,15,20},{-13, 2, 21, 30,-6},{17, 22, -5,3,6}};
        QR_Eig_matrix  c11=cc.new QR_Eig_matrix();
        c11.QR_Eig_matrix(input_AA);
        double[] u=c11.u;
        double[] v=c11.v;
        cc.print_matrix(u);
        cc.print_matrix(v);
        System.out.println("_______________________________________");
        
        double[] input_A= cc.gennerate_RandomArray(21, 2, 97.5);
        sort_matrix b=cc.new sort_matrix();
        double[]  c12=b.bubble_sort_matrix(input_A);
        cc.print_matrix(c12);
        double[]  c13=b.quick_sort_matrix(input_A, 0, input_A.length-1);
        cc.print_matrix(c13);
        double[]  c14=b.selection_sort_matrix(input_A);
        cc.print_matrix(c14);
        double[]  c15=b.insertion_sort_matrix(input_A);
        cc.print_matrix(c15);
        double[]  c16=b.shell_sort_matrix(input_A);
        cc.print_matrix(c16);
        System.out.println("_______________________________________");
        
        input_AA=new double[][]{{1,1,-1},{2 ,1 ,0},{1, -1, 0},{-1,2,1}};
        double[][] c18=cc.reverse_matrix(input_AA);
        cc.print_matrix(c18);
        System.out.println("_______________________________________");
        
        int aa=12;
        cc.isArray(aa);
        System.out.println("_______________________________________");
      
        double[] yyy=new double[]{0,0,1.01,0};
        RGKT xxx=cc.new RGKT(4,1500,0,0.02,yyy);
        class aaaa extends RGKT{
            public aaaa(RGKT t){
                        t.super(4,1500,0,0.02,yyy); //this line is very import!
                         }
            @Override
            public void func(double t,double[] y,double[] dy) {
                 dy[0] = 1;
	         dy[1] = 10*(y[2]-y[1]);
                 dy[2]=y[1]*(28-y[3])-y[2];
                 dy[3]=y[1]*y[2]-3*y[3];
	         
                  }
        }
        aaaa dd=new aaaa(xxx);
        dd.RGKT_solution();
        cc.print_matrix(dd.z);
        System.out.println("_______________________________________");
        double[] ttt=dd.z[0];
        double[] yy=dd.z[2];
        
        double[] yyy1=new double[]{0,0,1,0};
        RGKT xxx1=cc.new RGKT(4,1500,0,0.02,yyy1);
        class aaaa1 extends RGKT{
            public aaaa1(RGKT t){
                        t.super(4,1500,0,0.02,yyy1); //this line is very import!
                         }
            @Override
            public void func(double t,double[] y,double[] dy) {
                 dy[0] = 1;
	         dy[1] = 10*(y[2]-y[1]);
                 dy[2]=y[1]*(28-y[3])-y[2];
                 dy[3]=y[1]*y[2]-3*y[3];
	         
                  }
        }
        aaaa1 dd1=new aaaa1(xxx1);
        dd1.RGKT_solution();
        cc.print_matrix(dd1.z);
        System.out.println("_______________________________________");
        double[] ttt1=dd1.z[0];
        double[] yy1=dd1.z[2];
        
//        yyy1=new double[]{0,0,1,0};
//        RGKT1 xxxx1=cc.new RGKT1(4,1500,0,0.02,yyy1);
      
        
        LineChart s=cc.new LineChart();
        s.plotmxy("范例","X","Y", ttt,yy,ttt1,yy1);
        cc.plotxy_SWT_m("x","y",ttt,yy,ttt1,yy1) ;
  
        
        
       double[] x = {0.10 ,0.15,0.25 ,0.40 ,0.50,0.57,0.70,0.85,0.93,1.00};
       double[] y = {0.904837,0.860708,0.778801,0.670320,0.606531,0.565525, 0.496585,0.427415,0.394554,0.367879};
       double t=cc.Lag_interp1(0.63, x, y); 
       System.out.println(Double.toString(t));
        
       
       x=new double[]{0.1,0.15,0.3,0.45,0.55,0.6,0.7,0.85,0.9,1};
       y=new double[]{0.904937,0.860708,0.740818,0.637628,0.57695,0.548812,0.496585,0.427415,0.40657,0.367879};
       double[] dy=new double[]{-0.904937,-0.860708,-0.740818,-0.637628,-0.57695,-0.548812,-0.496585,-0.427415,-0.40657,-0.367879};
       t=cc.HMT_interp1(0.356, x, y,dy); 
       System.out.println(Double.toString(t)); 
       
       x=new double[]{-1,-0.95,-0.75,-0.55,-0.3,0,0.2,0.45,0.6,0.8,1};
       y=new double[]{0.0384615,0.0424403,0.06639,0.116788,0.307692,1,0.5,0.164948,0.1,0.0588236,0.0384615};
       t=cc.AKM_interp1(0.15, x, y);
       System.out.println(Double.toString(t)); 
       
       x=new double[]{0.52,8.0,17.95,28.65,50.65,104.6,156.6,260.7,364.4,468.0,507.0,520.0};
       y=new double[]{5.28794,13.8400,20.2000,24.9000,31.1000,36.5000,36.6000,31.0000,20.9000,7.80000,1.50000,0.200000};
       dy=new double[]{1.86548,0,0,0,0,0,0,0,0,0,0,  -0.046115};
       double[] z=new double[]{4.0,  14.0 , 30.0 , 60.0 , 130.0,  230.0,  450.0 , 515.0};
       double[][]  c19=cc.Spline1_interp1(x,y,dy,z);
       cc.print_matrix(c19);
       System.out.println("_______________________________________");
       
       x=new double[]{0.52,8.0,17.95,28.65,50.65,104.6,156.6,260.7,364.4,468.0,507.0,520.0};
       y=new double[]{5.28794,13.8400,20.2000,24.9000,31.1000,36.5000,36.6000,31.0000,20.9000,7.80000,1.50000,0.200000};
       double[] ddy=new double[]{-0.279319,0,0,0,0,0,0,0,0,0,0,  0.0111560};
       z=new double[]{4.0,  14.0 , 30.0 , 60.0 , 130.0,  230.0,  450.0 , 515.0};
       double[][]  c20=cc.Spline2_interp1(x,y,ddy,z);
       cc.print_matrix(c20);
       System.out.println("_______________________________________");
       
       x=new double[]{0,0.174533,0.349066,0.523599,0.698132,0.872665,1.0472,1.22173,1.39626,1.5708,1.74533,1.91986,2.0944,2.26893,2.44346,2.61799,2.79253,2.96706,3.14159,3.31613,3.49066,3.66519,3.83972,4.01426,4.18879,4.36332,4.53786,4.71239,4.88692,5.06145,5.23599,5.41052,5.58505,5.75959,5.93412,6.10865,6.28319};
       y=new double[]{0,0.173648,0.34202,0.5,0.642788,0.766044,0.866025,0.939693,0.984808,1,0.984808,0.939693,0.866025,0.766044,0.642788, 0.5,0.34202,0.173648,5.35898e-008,-0.173648,-0.34202,-0.5,-0.642788,-0.766044,-0.866025,-0.939693,-0.984808,-1,-0.984808,-0.939693,-0.866025,-0.766045,-0.642788,-0.5,-0.34202,-0.173648,-1.0718e-007};
       z=new double[]{0.0872665,  0.261799,  0.436332,  0.610865 , 0.785398  ,0.959931 , 1.13446 , 1.309 , 1.48353,  1.65806,  1.8326,  2.00713,  2.18166,  2.35619 , 2.53073 , 2.70526 , 2.87979,  3.05433 , 3.22886 , 3.40339,  3.57792  ,3.75246,  3.92699,  4.10152,  4.27606, 4.45059 , 4.62512 , 4.79966 , 4.97419 , 5.14872,  5.32325,  5.49779 , 5.67232 , 5.84685 , 6.02139,  6.19592};
       double[][]  c21=cc.Spline3_interp1(x,y,z);
       cc.print_matrix(c21);
       System.out.println("_______________________________________");
       
       
       x=new double[]{0.1,0.15,0.3,0.45,0.55,0.6,0.7,0.85,0.9,1};
       y=new double[]{0.904937,0.860708,0.740818,0.637628,0.57695,0.548812,0.496585,0.427415,0.40657,0.367879};
       //x=new double[]{0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1,1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9};
       //y=new double[]{-1,-0.804837,-0.618731,-0.440818,-0.27032,-0.106531,0.0511884,0.203415,0.350671,0.49343,0.632121,0.767129,0.898806,1.02747,1.1534,1.27687,1.3981,1.51732,1.6347,1.75043};
       double[] c22=cc.polyfit(x,y,3);
       cc.print_matrix(c22);
       System.out.println("_______________________________________");
       
       
       
       xx=new double[][]{{1.1,1.0, 1.2 ,1.1,0.9},{2.0,2.0,1.8,1.9,2.1},{3.2,3.2,3,2.9,2.9},{1,1,1,1,1}};
       y=new double[]{10.1,10.2,10.0,10.1,10.0};
       double[] c24=cc.regres_matrix( xx, y);
       cc.print_matrix(c24);
       
       
       x=new double[]{0.1,0.15,0.3,0.45,0.55,0.6,0.7,0.85,0.9,1};
       y=new double[]{0.904937,0.860708,0.740818,0.637628,0.57695,0.548812,0.496585,0.427415,0.40657,0.367879};
       //x=new double[]{0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1,1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9};
       //y=new double[]{-1,-0.804837,-0.618731,-0.440818,-0.27032,-0.106531,0.0511884,0.203415,0.350671,0.49343,0.632121,0.767129,0.898806,1.02747,1.1534,1.27687,1.3981,1.51732,1.6347,1.75043};
       matrix.polyfit_result c25=cc.polyfit_class(x,y,4);
       cc.print_matrix(c25.a);
       cc.print_matrix(c25.dt);
       System.out.println("_______________________________________");
       
        int M = 8, N = 5;
        Matrix B = Matrix.random(5, 3);
        Matrix A = Matrix.random(M, N).times(B).times(B.transpose());
        double[][] CCC=A.getArray();
        SVD_matrix  c26=cc.new SVD_matrix(CCC);
        cc.print_matrix(c26.SS);
        System.out.println("_______________________________________");
        cc.print_matrix(c26.V);
        System.out.println("_______________________________________");
        cc.print_matrix(c26.U);
        System.out.println("_______________________________________");
        cc.print_matrix(CCC);
         System.out.print("A = ");
         A.print(9, 6);
// 
//        // compute the singular vallue decomposition
//        System.out.println("A = U S V^T");
//        System.out.println();
//        
//        
        //long start = System.currentTimeMillis(); 
//        //进行奇异值分解
        SingularValueDecomposition sss = A.svd();
        //long end = System.currentTimeMillis(); 
        //System.out.println("Singular Value Decomposition elapsed time: "+(end-start));
        Matrix UU = sss.getU();
        Matrix SS = sss.getS();
        Matrix VV = sss.getV();
        
        System.out.print("U = ");
        UU.print(9, 6);
        System.out.print("Sigma = ");
        SS.print(9, 6);
        System.out.print("V = ");
        VV.print(9, 6);
        
        System.out.println("rank = " + sss.rank());
        System.out.println("condition number = " + sss.cond());
        System.out.println("2-norm = " + sss.norm2());
 
        // print out singular values
        System.out.print("singular values = ");
        Matrix svalues = new Matrix(sss.getSingularValues(), 1);
        svalues.print(9, 6);
        
        
        

       
       
    }
}
     
   
