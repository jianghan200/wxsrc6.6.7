package com.tencent.mm.protocal.c;

public final class chy
  extends com.tencent.mm.bk.a
{
  public int otY;
  public int rRb;
  public int riv;
  public int sBT;
  public int sBU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rRb);
      paramVarArgs.fT(2, this.riv);
      paramVarArgs.fT(3, this.sBT);
      paramVarArgs.fT(4, this.otY);
      paramVarArgs.fT(10, this.sBU);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rRb) + 0 + f.a.a.a.fQ(2, this.riv) + f.a.a.a.fQ(3, this.sBT) + f.a.a.a.fQ(4, this.otY) + f.a.a.a.fQ(10, this.sBU);
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
      chy localchy = (chy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      default: 
        return -1;
      case 1: 
        localchy.rRb = locala.vHC.rY();
        return 0;
      case 2: 
        localchy.riv = locala.vHC.rY();
        return 0;
      case 3: 
        localchy.sBT = locala.vHC.rY();
        return 0;
      case 4: 
        localchy.otY = locala.vHC.rY();
        return 0;
      }
      localchy.sBU = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/chy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */