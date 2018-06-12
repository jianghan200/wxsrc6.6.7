package com.tencent.mm.protocal.c;

public final class pd
  extends com.tencent.mm.bk.a
{
  public String bPS;
  public int mQH;
  public String path;
  public long rty;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.rty);
      paramVarArgs.fT(2, this.mQH);
      if (this.bPS != null) {
        paramVarArgs.g(3, this.bPS);
      }
      if (this.path != null) {
        paramVarArgs.g(4, this.path);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.S(1, this.rty) + 0 + f.a.a.a.fQ(2, this.mQH);
      paramInt = i;
      if (this.bPS != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.bPS);
      }
      i = paramInt;
    } while (this.path == null);
    return paramInt + f.a.a.b.b.a.h(4, this.path);
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
      pd localpd = (pd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localpd.rty = locala.vHC.rZ();
        return 0;
      case 2: 
        localpd.mQH = locala.vHC.rY();
        return 0;
      case 3: 
        localpd.bPS = locala.vHC.readString();
        return 0;
      }
      localpd.path = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/pd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */