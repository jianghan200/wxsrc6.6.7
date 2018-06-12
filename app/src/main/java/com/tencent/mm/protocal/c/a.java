package com.tencent.mm.protocal.c;

public final class a
  extends com.tencent.mm.bk.a
{
  public String bSc;
  public int bWA;
  public String hUt;
  public String kRu;
  public String kRv;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.bWA);
      if (this.bSc != null) {
        paramVarArgs.g(2, this.bSc);
      }
      if (this.kRu != null) {
        paramVarArgs.g(3, this.kRu);
      }
      if (this.kRv != null) {
        paramVarArgs.g(4, this.kRv);
      }
      if (this.hUt != null) {
        paramVarArgs.g(5, this.hUt);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.bWA) + 0;
      paramInt = i;
      if (this.bSc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bSc);
      }
      i = paramInt;
      if (this.kRu != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.kRu);
      }
      paramInt = i;
      if (this.kRv != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.kRv);
      }
      i = paramInt;
    } while (this.hUt == null);
    return paramInt + f.a.a.b.b.a.h(5, this.hUt);
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
      a locala1 = (a)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        locala1.bWA = locala.vHC.rY();
        return 0;
      case 2: 
        locala1.bSc = locala.vHC.readString();
        return 0;
      case 3: 
        locala1.kRu = locala.vHC.readString();
        return 0;
      case 4: 
        locala1.kRv = locala.vHC.readString();
        return 0;
      }
      locala1.hUt = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */