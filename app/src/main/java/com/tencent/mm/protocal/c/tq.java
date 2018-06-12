package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class tq
  extends com.tencent.mm.bk.a
{
  public String jTh;
  public String rxn;
  public String rxo;
  public String rxp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jTh == null) {
        throw new b("Not all required fields were included: Label");
      }
      if (this.rxn == null) {
        throw new b("Not all required fields were included: Number");
      }
      if (this.rxo == null) {
        throw new b("Not all required fields were included: Type");
      }
      if (this.jTh != null) {
        paramVarArgs.g(1, this.jTh);
      }
      if (this.rxn != null) {
        paramVarArgs.g(2, this.rxn);
      }
      if (this.rxo != null) {
        paramVarArgs.g(3, this.rxo);
      }
      if (this.rxp != null) {
        paramVarArgs.g(4, this.rxp);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jTh == null) {
        break label444;
      }
    }
    label444:
    for (int i = f.a.a.b.b.a.h(1, this.jTh) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rxn != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rxn);
      }
      i = paramInt;
      if (this.rxo != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rxo);
      }
      paramInt = i;
      if (this.rxp != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rxp);
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
        if (this.jTh == null) {
          throw new b("Not all required fields were included: Label");
        }
        if (this.rxn == null) {
          throw new b("Not all required fields were included: Number");
        }
        if (this.rxo != null) {
          break;
        }
        throw new b("Not all required fields were included: Type");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        tq localtq = (tq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localtq.jTh = locala.vHC.readString();
          return 0;
        case 2: 
          localtq.rxn = locala.vHC.readString();
          return 0;
        case 3: 
          localtq.rxo = locala.vHC.readString();
          return 0;
        }
        localtq.rxp = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/tq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */