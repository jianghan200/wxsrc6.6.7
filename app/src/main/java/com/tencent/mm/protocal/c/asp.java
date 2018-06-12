package com.tencent.mm.protocal.c;

public final class asp
  extends com.tencent.mm.bk.a
{
  public String bSc;
  public String kRu;
  public String kRv;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bSc != null) {
        paramVarArgs.g(1, this.bSc);
      }
      if (this.kRu != null) {
        paramVarArgs.g(2, this.kRu);
      }
      if (this.kRv != null) {
        paramVarArgs.g(4, this.kRv);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bSc == null) {
        break label293;
      }
    }
    label293:
    for (int i = f.a.a.b.b.a.h(1, this.bSc) + 0;; i = 0)
    {
      paramInt = i;
      if (this.kRu != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.kRu);
      }
      i = paramInt;
      if (this.kRv != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.kRv);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        asp localasp = (asp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 3: 
        default: 
          return -1;
        case 1: 
          localasp.bSc = locala.vHC.readString();
          return 0;
        case 2: 
          localasp.kRu = locala.vHC.readString();
          return 0;
        }
        localasp.kRv = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/asp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */