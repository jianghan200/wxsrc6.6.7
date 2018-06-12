package com.tencent.mm.plugin.luckymoney.b;

public final class n
  extends com.tencent.mm.bk.a
{
  public String kPS;
  public String kQC;
  public String kQD;
  public String kQE;
  public String kQF;
  public long kQp;
  public String kQq;
  public String userName;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.kQC != null) {
        paramVarArgs.g(1, this.kQC);
      }
      if (this.kQD != null) {
        paramVarArgs.g(2, this.kQD);
      }
      paramVarArgs.T(3, this.kQp);
      if (this.kQq != null) {
        paramVarArgs.g(4, this.kQq);
      }
      if (this.kQE != null) {
        paramVarArgs.g(5, this.kQE);
      }
      if (this.kPS != null) {
        paramVarArgs.g(6, this.kPS);
      }
      if (this.kQF != null) {
        paramVarArgs.g(7, this.kQF);
      }
      if (this.userName != null) {
        paramVarArgs.g(8, this.userName);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.kQC == null) {
        break label552;
      }
    }
    label552:
    for (paramInt = f.a.a.b.b.a.h(1, this.kQC) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.kQD != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.kQD);
      }
      i += f.a.a.a.S(3, this.kQp);
      paramInt = i;
      if (this.kQq != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.kQq);
      }
      i = paramInt;
      if (this.kQE != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.kQE);
      }
      paramInt = i;
      if (this.kPS != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.kPS);
      }
      i = paramInt;
      if (this.kQF != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.kQF);
      }
      paramInt = i;
      if (this.userName != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.userName);
      }
      return paramInt;
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
        n localn = (n)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localn.kQC = locala.vHC.readString();
          return 0;
        case 2: 
          localn.kQD = locala.vHC.readString();
          return 0;
        case 3: 
          localn.kQp = locala.vHC.rZ();
          return 0;
        case 4: 
          localn.kQq = locala.vHC.readString();
          return 0;
        case 5: 
          localn.kQE = locala.vHC.readString();
          return 0;
        case 6: 
          localn.kPS = locala.vHC.readString();
          return 0;
        case 7: 
          localn.kQF = locala.vHC.readString();
          return 0;
        }
        localn.userName = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */