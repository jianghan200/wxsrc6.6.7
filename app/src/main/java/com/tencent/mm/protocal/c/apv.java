package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class apv
  extends com.tencent.mm.bk.a
{
  public int hbF;
  public int rSt;
  public b rSu;
  public int rSv;
  public int rSw;
  public int rvJ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rSt);
      if (this.rSu != null) {
        paramVarArgs.b(2, this.rSu);
      }
      paramVarArgs.fT(3, this.rSv);
      paramVarArgs.fT(4, this.rvJ);
      paramVarArgs.fT(5, this.hbF);
      paramVarArgs.fT(6, this.rSw);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.rSt) + 0;
      paramInt = i;
      if (this.rSu != null) {
        paramInt = i + f.a.a.a.a(2, this.rSu);
      }
      return paramInt + f.a.a.a.fQ(3, this.rSv) + f.a.a.a.fQ(4, this.rvJ) + f.a.a.a.fQ(5, this.hbF) + f.a.a.a.fQ(6, this.rSw);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
      apv localapv = (apv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localapv.rSt = locala.vHC.rY();
        return 0;
      case 2: 
        localapv.rSu = locala.cJR();
        return 0;
      case 3: 
        localapv.rSv = locala.vHC.rY();
        return 0;
      case 4: 
        localapv.rvJ = locala.vHC.rY();
        return 0;
      case 5: 
        localapv.hbF = locala.vHC.rY();
        return 0;
      }
      localapv.rSw = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/apv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */