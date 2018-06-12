package com.tencent.mm.protocal.c;

public final class aqo
  extends com.tencent.mm.bk.a
{
  public String hym;
  public double latitude;
  public double longitude;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.c(1, this.latitude);
      paramVarArgs.c(2, this.longitude);
      if (this.hym != null) {
        paramVarArgs.g(3, this.hym);
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
      i = f.a.a.b.b.a.ec(1) + 8 + 0 + (f.a.a.b.b.a.ec(2) + 8);
      paramInt = i;
    } while (this.hym == null);
    return i + f.a.a.b.b.a.h(3, this.hym);
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
      aqo localaqo = (aqo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localaqo.latitude = locala.vHC.readDouble();
        return 0;
      case 2: 
        localaqo.longitude = locala.vHC.readDouble();
        return 0;
      }
      localaqo.hym = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aqo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */