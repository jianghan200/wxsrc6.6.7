package com.tencent.mm.protocal.c;

public final class awp
  extends com.tencent.mm.bk.a
{
  public String desc;
  public String fJU;
  public int rZQ;
  public String scope;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.scope != null) {
        paramVarArgs.g(1, this.scope);
      }
      if (this.desc != null) {
        paramVarArgs.g(2, this.desc);
      }
      paramVarArgs.fT(3, this.rZQ);
      if (this.fJU != null) {
        paramVarArgs.g(4, this.fJU);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.scope == null) {
        break label328;
      }
    }
    label328:
    for (paramInt = f.a.a.b.b.a.h(1, this.scope) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.desc != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.desc);
      }
      i += f.a.a.a.fQ(3, this.rZQ);
      paramInt = i;
      if (this.fJU != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.fJU);
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
        awp localawp = (awp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localawp.scope = locala.vHC.readString();
          return 0;
        case 2: 
          localawp.desc = locala.vHC.readString();
          return 0;
        case 3: 
          localawp.rZQ = locala.vHC.rY();
          return 0;
        }
        localawp.fJU = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/awp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */