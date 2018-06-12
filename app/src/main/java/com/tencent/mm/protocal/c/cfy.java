package com.tencent.mm.protocal.c;

public final class cfy
  extends com.tencent.mm.bk.a
{
  public String bKg;
  public int rka;
  public int sAw;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.sAw);
      paramVarArgs.fT(2, this.rka);
      if (this.url != null) {
        paramVarArgs.g(3, this.url);
      }
      if (this.bKg != null) {
        paramVarArgs.g(4, this.bKg);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.sAw) + 0 + f.a.a.a.fQ(2, this.rka);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.url);
      }
      i = paramInt;
    } while (this.bKg == null);
    return paramInt + f.a.a.b.b.a.h(4, this.bKg);
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
      cfy localcfy = (cfy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcfy.sAw = locala.vHC.rY();
        return 0;
      case 2: 
        localcfy.rka = locala.vHC.rY();
        return 0;
      case 3: 
        localcfy.url = locala.vHC.readString();
        return 0;
      }
      localcfy.bKg = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cfy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */