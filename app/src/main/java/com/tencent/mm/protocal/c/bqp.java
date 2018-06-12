package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bqp
  extends com.tencent.mm.bk.a
{
  public int rth;
  public int rxG;
  public int soA;
  public int soB;
  public int soC;
  public int soD;
  public LinkedList<Integer> soE = new LinkedList();
  public int soF;
  public int soG;
  public LinkedList<Integer> soH = new LinkedList();
  public int soI;
  public int soJ;
  public int soz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rxG);
      paramVarArgs.fT(2, this.soz);
      paramVarArgs.fT(3, this.rth);
      paramVarArgs.fT(4, this.soA);
      paramVarArgs.fT(5, this.soB);
      paramVarArgs.fT(6, this.soC);
      paramVarArgs.fT(7, this.soD);
      paramVarArgs.d(8, 2, this.soE);
      paramVarArgs.fT(9, this.soF);
      paramVarArgs.fT(10, this.soG);
      paramVarArgs.d(11, 2, this.soH);
      paramVarArgs.fT(12, this.soI);
      paramVarArgs.fT(13, this.soJ);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rxG) + 0 + f.a.a.a.fQ(2, this.soz) + f.a.a.a.fQ(3, this.rth) + f.a.a.a.fQ(4, this.soA) + f.a.a.a.fQ(5, this.soB) + f.a.a.a.fQ(6, this.soC) + f.a.a.a.fQ(7, this.soD) + f.a.a.a.c(8, 2, this.soE) + f.a.a.a.fQ(9, this.soF) + f.a.a.a.fQ(10, this.soG) + f.a.a.a.c(11, 2, this.soH) + f.a.a.a.fQ(12, this.soI) + f.a.a.a.fQ(13, this.soJ);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.soE.clear();
      this.soH.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      bqp localbqp = (bqp)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbqp.rxG = locala.vHC.rY();
        return 0;
      case 2: 
        localbqp.soz = locala.vHC.rY();
        return 0;
      case 3: 
        localbqp.rth = locala.vHC.rY();
        return 0;
      case 4: 
        localbqp.soA = locala.vHC.rY();
        return 0;
      case 5: 
        localbqp.soB = locala.vHC.rY();
        return 0;
      case 6: 
        localbqp.soC = locala.vHC.rY();
        return 0;
      case 7: 
        localbqp.soD = locala.vHC.rY();
        return 0;
      case 8: 
        localbqp.soE.add(Integer.valueOf(locala.vHC.rY()));
        return 0;
      case 9: 
        localbqp.soF = locala.vHC.rY();
        return 0;
      case 10: 
        localbqp.soG = locala.vHC.rY();
        return 0;
      case 11: 
        localbqp.soH.add(Integer.valueOf(locala.vHC.rY()));
        return 0;
      case 12: 
        localbqp.soI = locala.vHC.rY();
        return 0;
      }
      localbqp.soJ = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */