package com.tencent.mm.protocal.c;

public final class ani
  extends com.tencent.mm.bk.a
{
  public String jPH;
  public String lRx;
  public int rsj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rsj);
      if (this.lRx != null) {
        paramVarArgs.g(2, this.lRx);
      }
      if (this.jPH != null) {
        paramVarArgs.g(3, this.jPH);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rsj) + 0;
      paramInt = i;
      if (this.lRx != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.lRx);
      }
      i = paramInt;
    } while (this.jPH == null);
    return paramInt + f.a.a.b.b.a.h(3, this.jPH);
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
      ani localani = (ani)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localani.rsj = locala.vHC.rY();
        return 0;
      case 2: 
        localani.lRx = locala.vHC.readString();
        return 0;
      }
      localani.jPH = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/ani.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */