package com.tencent.mm.protocal.c;

public final class byt
  extends com.tencent.mm.bk.a
{
  public int rgC;
  public int suB;
  public String suF;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.suB);
      paramVarArgs.fT(2, this.rgC);
      if (this.suF != null) {
        paramVarArgs.g(3, this.suF);
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
      i = f.a.a.a.fQ(1, this.suB) + 0 + f.a.a.a.fQ(2, this.rgC);
      paramInt = i;
    } while (this.suF == null);
    return i + f.a.a.b.b.a.h(3, this.suF);
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
      byt localbyt = (byt)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbyt.suB = locala.vHC.rY();
        return 0;
      case 2: 
        localbyt.rgC = locala.vHC.rY();
        return 0;
      }
      localbyt.suF = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/byt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */