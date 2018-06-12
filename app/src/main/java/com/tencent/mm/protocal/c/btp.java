package com.tencent.mm.protocal.c;

public final class btp
  extends com.tencent.mm.bk.a
{
  public String jPe;
  public double rji;
  public double rjj;
  public String sbw;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.c(1, this.rjj);
      paramVarArgs.c(2, this.rji);
      if (this.jPe != null) {
        paramVarArgs.g(3, this.jPe);
      }
      if (this.sbw != null) {
        paramVarArgs.g(4, this.sbw);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.b.b.a.ec(1) + 8 + 0 + (f.a.a.b.b.a.ec(2) + 8);
      paramInt = i;
      if (this.jPe != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.jPe);
      }
      i = paramInt;
    } while (this.sbw == null);
    return paramInt + f.a.a.b.b.a.h(4, this.sbw);
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
      btp localbtp = (btp)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbtp.rjj = locala.vHC.readDouble();
        return 0;
      case 2: 
        localbtp.rji = locala.vHC.readDouble();
        return 0;
      case 3: 
        localbtp.jPe = locala.vHC.readString();
        return 0;
      }
      localbtp.sbw = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/btp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */