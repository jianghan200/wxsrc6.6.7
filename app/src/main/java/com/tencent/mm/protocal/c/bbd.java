package com.tencent.mm.protocal.c;

public final class bbd
  extends com.tencent.mm.bk.a
{
  public float rmr;
  public float rms;
  public int ryV;
  public String ryW;
  public String ryX;
  public int ryY;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.l(1, this.rmr);
      paramVarArgs.l(2, this.rms);
      paramVarArgs.fT(3, this.ryV);
      if (this.ryW != null) {
        paramVarArgs.g(4, this.ryW);
      }
      if (this.ryX != null) {
        paramVarArgs.g(5, this.ryX);
      }
      paramVarArgs.fT(6, this.ryY);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.b.b.a.ec(1) + 4 + 0 + (f.a.a.b.b.a.ec(2) + 4) + f.a.a.a.fQ(3, this.ryV);
      paramInt = i;
      if (this.ryW != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.ryW);
      }
      i = paramInt;
      if (this.ryX != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.ryX);
      }
      return i + f.a.a.a.fQ(6, this.ryY);
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
      bbd localbbd = (bbd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbbd.rmr = locala.vHC.readFloat();
        return 0;
      case 2: 
        localbbd.rms = locala.vHC.readFloat();
        return 0;
      case 3: 
        localbbd.ryV = locala.vHC.rY();
        return 0;
      case 4: 
        localbbd.ryW = locala.vHC.readString();
        return 0;
      case 5: 
        localbbd.ryX = locala.vHC.readString();
        return 0;
      }
      localbbd.ryY = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */