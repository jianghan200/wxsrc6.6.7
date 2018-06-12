package com.tencent.mm.protocal.c;

public final class amy
  extends com.tencent.mm.bk.a
{
  public String jTh;
  public float rPK;
  public String rPL;
  public float rjG;
  public float rjH;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.l(1, this.rjG);
      paramVarArgs.l(2, this.rjH);
      paramVarArgs.l(3, this.rPK);
      if (this.jTh != null) {
        paramVarArgs.g(4, this.jTh);
      }
      if (this.rPL != null) {
        paramVarArgs.g(5, this.rPL);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.b.b.a.ec(1) + 4 + 0 + (f.a.a.b.b.a.ec(2) + 4) + (f.a.a.b.b.a.ec(3) + 4);
      paramInt = i;
      if (this.jTh != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jTh);
      }
      i = paramInt;
    } while (this.rPL == null);
    return paramInt + f.a.a.b.b.a.h(5, this.rPL);
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
      amy localamy = (amy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localamy.rjG = locala.vHC.readFloat();
        return 0;
      case 2: 
        localamy.rjH = locala.vHC.readFloat();
        return 0;
      case 3: 
        localamy.rPK = locala.vHC.readFloat();
        return 0;
      case 4: 
        localamy.jTh = locala.vHC.readString();
        return 0;
      }
      localamy.rPL = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/amy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */