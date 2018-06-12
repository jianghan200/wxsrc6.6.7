package com.tencent.mm.platformtools;

import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class af
{
  public static boolean ewA = false;
  public static boolean ewB = false;
  public static boolean ewC = false;
  public static boolean ewD = false;
  public static boolean ewE = false;
  public static boolean ewF = false;
  public static boolean ewG = false;
  public static boolean ewH = false;
  public static boolean ewI = false;
  public static boolean ewJ = false;
  public static boolean ewK = false;
  public static boolean ewL = false;
  public static String ewM = "";
  public static boolean ewN = false;
  public static boolean ewO = false;
  public static boolean ewP = false;
  public static boolean ewQ = false;
  public static int ewR = 0;
  public static boolean ewS = false;
  public static boolean ewT = false;
  public static boolean ewU = false;
  public static String ewV = "";
  public static String ewW = "";
  public static boolean ewX = false;
  public static boolean ewY = false;
  public static boolean ewZ = false;
  public static String exA = "";
  public static boolean exB = false;
  public static boolean exC = false;
  public static boolean exD = false;
  public static int exE = 0;
  public static boolean exF = false;
  public static boolean exG = false;
  public static boolean exH = false;
  public static boolean exI = false;
  public static boolean exJ = false;
  public static boolean exK = false;
  public static boolean exL = true;
  public static boolean exM = false;
  public static boolean exN = false;
  public static String exO = "";
  public static int exP = 0;
  public static boolean exQ = false;
  public static boolean exR = false;
  public static int exS = -1;
  public static boolean exT = false;
  public static String exU = "";
  public static float exV = 0.4F;
  public static float exW = 0.7F;
  public static boolean exX = false;
  public static String exY = "";
  public static String exZ = "";
  public static boolean exa = false;
  public static boolean exb = false;
  public static boolean exc = false;
  public static boolean exd = false;
  public static int exe = 0;
  public static int exf = 0;
  public static boolean exg = false;
  public static String exh = null;
  public static String exi = null;
  public static boolean exj = false;
  public static boolean exk = false;
  public static int exl = 0;
  public static int exm = 0;
  public static int exn = 0;
  public static String exo = "";
  public static String exp = "";
  public static String exq = null;
  public static String exr = null;
  public static boolean exs = false;
  public static boolean ext = false;
  public static boolean exu = false;
  public static boolean exv = false;
  public static String exw;
  public static String exx;
  public static String exy;
  public static String exz;
  public static boolean eya = false;
  public static boolean eyb = false;
  public static String eyc = "";
  public static String eyd = "";
  public static boolean eye = false;
  public static boolean eyf = false;
  public static boolean eyg = false;
  public static boolean eyh = false;
  public static boolean eyi = false;
  public static boolean eyj = false;
  public static boolean eyk = false;
  private static HashMap<Integer, ConcurrentLinkedQueue<Integer>> eyl = new HashMap();
  public static boolean eym = false;
  public static boolean eyn = false;
  public static boolean eyo = false;
  public static double lat = 0.0D;
  public static double lng = 0.0D;
  
  static
  {
    exw = "";
    exx = "";
    exy = "";
    exz = "";
  }
  
  public static void bt(int paramInt1, int paramInt2)
  {
    synchronized (eyl)
    {
      ConcurrentLinkedQueue localConcurrentLinkedQueue2 = (ConcurrentLinkedQueue)eyl.get(Integer.valueOf(paramInt1));
      ConcurrentLinkedQueue localConcurrentLinkedQueue1 = localConcurrentLinkedQueue2;
      if (localConcurrentLinkedQueue2 == null)
      {
        localConcurrentLinkedQueue1 = new ConcurrentLinkedQueue();
        eyl.put(Integer.valueOf(paramInt1), localConcurrentLinkedQueue1);
      }
      localConcurrentLinkedQueue1.add(Integer.valueOf(paramInt2));
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/platformtools/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */