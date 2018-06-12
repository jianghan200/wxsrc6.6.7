package com.tencent.mm.protocal.c;

public final class axb
  extends com.tencent.mm.bk.a
{
  public int rko;
  public int rth;
  public int sai;
  public String saj;
  public String sak;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rko);
      if (this.sak != null) {
        paramVarArgs.g(3, this.sak);
      }
      paramVarArgs.fT(4, this.sai);
      paramVarArgs.fT(5, this.rth);
      if (this.saj != null) {
        paramVarArgs.g(6, this.saj);
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
      i = f.a.a.a.fQ(1, this.rko) + 0;
      paramInt = i;
      if (this.sak != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.sak);
      }
      i = paramInt + f.a.a.a.fQ(4, this.sai) + f.a.a.a.fQ(5, this.rth);
      paramInt = i;
    } while (this.saj == null);
    return i + f.a.a.b.b.a.h(6, this.saj);
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
      axb localaxb = (axb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      case 2: 
      default: 
        return -1;
      case 1: 
        localaxb.rko = locala.vHC.rY();
        return 0;
      case 3: 
        localaxb.sak = locala.vHC.readString();
        return 0;
      case 4: 
        localaxb.sai = locala.vHC.rY();
        return 0;
      case 5: 
        localaxb.rth = locala.vHC.rY();
        return 0;
      }
      localaxb.saj = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/axb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */