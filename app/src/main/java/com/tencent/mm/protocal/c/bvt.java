package com.tencent.mm.protocal.c;

public final class bvt
  extends com.tencent.mm.bk.a
{
  public int rdV;
  public int rdW;
  public int rfn;
  public String rwt;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rfn);
      paramVarArgs.fT(2, this.rdW);
      paramVarArgs.fT(3, this.rdV);
      if (this.rwt != null) {
        paramVarArgs.g(4, this.rwt);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rfn) + 0 + f.a.a.a.fQ(2, this.rdW) + f.a.a.a.fQ(3, this.rdV);
      paramInt = i;
    } while (this.rwt == null);
    return i + f.a.a.b.b.a.h(4, this.rwt);
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
      bvt localbvt = (bvt)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbvt.rfn = locala.vHC.rY();
        return 0;
      case 2: 
        localbvt.rdW = locala.vHC.rY();
        return 0;
      case 3: 
        localbvt.rdV = locala.vHC.rY();
        return 0;
      }
      localbvt.rwt = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bvt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */