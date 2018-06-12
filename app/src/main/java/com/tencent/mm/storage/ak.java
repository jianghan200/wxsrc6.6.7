package com.tencent.mm.storage;

import java.util.LinkedList;

public final class ak
  extends com.tencent.mm.bk.a
{
  public int taJ;
  public LinkedList<Integer> taK = new LinkedList();
  public LinkedList<Integer> taL = new LinkedList();
  public LinkedList<Integer> taM = new LinkedList();
  public LinkedList<Long> taN = new LinkedList();
  public LinkedList<Long> taO = new LinkedList();
  public LinkedList<Long> taP = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.taJ);
      paramVarArgs.d(2, 2, this.taK);
      paramVarArgs.d(3, 2, this.taL);
      paramVarArgs.d(4, 2, this.taM);
      paramVarArgs.d(5, 3, this.taN);
      paramVarArgs.d(6, 3, this.taO);
      paramVarArgs.d(7, 3, this.taP);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.taJ) + 0 + f.a.a.a.c(2, 2, this.taK) + f.a.a.a.c(3, 2, this.taL) + f.a.a.a.c(4, 2, this.taM) + f.a.a.a.c(5, 3, this.taN) + f.a.a.a.c(6, 3, this.taO) + f.a.a.a.c(7, 3, this.taP);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.taK.clear();
      this.taL.clear();
      this.taM.clear();
      this.taN.clear();
      this.taO.clear();
      this.taP.clear();
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
      ak localak = (ak)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localak.taJ = locala.vHC.rY();
        return 0;
      case 2: 
        localak.taK.add(Integer.valueOf(locala.vHC.rY()));
        return 0;
      case 3: 
        localak.taL.add(Integer.valueOf(locala.vHC.rY()));
        return 0;
      case 4: 
        localak.taM.add(Integer.valueOf(locala.vHC.rY()));
        return 0;
      case 5: 
        localak.taN.add(Long.valueOf(locala.vHC.rZ()));
        return 0;
      case 6: 
        localak.taO.add(Long.valueOf(locala.vHC.rZ()));
        return 0;
      }
      localak.taP.add(Long.valueOf(locala.vHC.rZ()));
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */