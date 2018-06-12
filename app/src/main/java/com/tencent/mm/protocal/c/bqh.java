package com.tencent.mm.protocal.c;

public final class bqh
  extends com.tencent.mm.bk.a
{
  public int rSI;
  public int rvt;
  public int sog;
  public int soh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rvt);
      paramVarArgs.fT(2, this.rSI);
      paramVarArgs.fT(3, this.sog);
      paramVarArgs.fT(4, this.soh);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rvt) + 0 + f.a.a.a.fQ(2, this.rSI) + f.a.a.a.fQ(3, this.sog) + f.a.a.a.fQ(4, this.soh);
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
      bqh localbqh = (bqh)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbqh.rvt = locala.vHC.rY();
        return 0;
      case 2: 
        localbqh.rSI = locala.vHC.rY();
        return 0;
      case 3: 
        localbqh.sog = locala.vHC.rY();
        return 0;
      }
      localbqh.soh = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bqh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */