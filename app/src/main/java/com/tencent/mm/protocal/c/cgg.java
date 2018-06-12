package com.tencent.mm.protocal.c;

public final class cgg
  extends com.tencent.mm.bk.a
{
  public int otY;
  public int rRb;
  public int rUA;
  public int rUB;
  public String rUC;
  public int riv;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rRb);
      paramVarArgs.fT(2, this.riv);
      paramVarArgs.fT(3, this.otY);
      if (this.rUC != null) {
        paramVarArgs.g(4, this.rUC);
      }
      paramVarArgs.fT(5, this.rUB);
      paramVarArgs.fT(6, this.rUA);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.rRb) + 0 + f.a.a.a.fQ(2, this.riv) + f.a.a.a.fQ(3, this.otY);
      paramInt = i;
      if (this.rUC != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rUC);
      }
      return paramInt + f.a.a.a.fQ(5, this.rUB) + f.a.a.a.fQ(6, this.rUA);
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
      cgg localcgg = (cgg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcgg.rRb = locala.vHC.rY();
        return 0;
      case 2: 
        localcgg.riv = locala.vHC.rY();
        return 0;
      case 3: 
        localcgg.otY = locala.vHC.rY();
        return 0;
      case 4: 
        localcgg.rUC = locala.vHC.readString();
        return 0;
      case 5: 
        localcgg.rUB = locala.vHC.rY();
        return 0;
      }
      localcgg.rUA = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/cgg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */