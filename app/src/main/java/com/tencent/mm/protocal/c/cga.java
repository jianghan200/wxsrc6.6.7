package com.tencent.mm.protocal.c;

public final class cga
  extends com.tencent.mm.bk.a
{
  public int riv;
  public String sAx;
  public String sAy;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.riv);
      if (this.sAx != null) {
        paramVarArgs.g(2, this.sAx);
      }
      if (this.sAy != null) {
        paramVarArgs.g(3, this.sAy);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.riv) + 0;
      paramInt = i;
      if (this.sAx != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.sAx);
      }
      i = paramInt;
    } while (this.sAy == null);
    return paramInt + f.a.a.b.b.a.h(3, this.sAy);
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
      cga localcga = (cga)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcga.riv = locala.vHC.rY();
        return 0;
      case 2: 
        localcga.sAx = locala.vHC.readString();
        return 0;
      }
      localcga.sAy = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */