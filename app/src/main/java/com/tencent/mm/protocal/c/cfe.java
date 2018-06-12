package com.tencent.mm.protocal.c;

public final class cfe
  extends com.tencent.mm.bk.a
{
  public com.tencent.mm.bk.b rdU;
  public int rvV;
  public boolean szM;
  public boolean szN;
  public String szk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.szk == null) {
        throw new f.a.a.b("Not all required fields were included: Talker");
      }
      if (this.szk != null) {
        paramVarArgs.g(1, this.szk);
      }
      paramVarArgs.fT(2, this.rvV);
      if (this.rdU != null) {
        paramVarArgs.b(3, this.rdU);
      }
      paramVarArgs.av(4, this.szM);
      paramVarArgs.av(5, this.szN);
      return 0;
    }
    if (paramInt == 1) {
      if (this.szk == null) {
        break label366;
      }
    }
    label366:
    for (paramInt = f.a.a.b.b.a.h(1, this.szk) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rvV);
      paramInt = i;
      if (this.rdU != null) {
        paramInt = i + f.a.a.a.a(3, this.rdU);
      }
      return paramInt + (f.a.a.b.b.a.ec(4) + 1) + (f.a.a.b.b.a.ec(5) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.szk != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: Talker");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cfe localcfe = (cfe)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcfe.szk = locala.vHC.readString();
          return 0;
        case 2: 
          localcfe.rvV = locala.vHC.rY();
          return 0;
        case 3: 
          localcfe.rdU = locala.cJR();
          return 0;
        case 4: 
          localcfe.szM = locala.cJQ();
          return 0;
        }
        localcfe.szN = locala.cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cfe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */