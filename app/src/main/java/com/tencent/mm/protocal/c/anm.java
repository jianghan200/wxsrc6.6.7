package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class anm
  extends com.tencent.mm.bk.a
{
  public String lPj;
  public String lRl;
  public String rFe;
  public String rQh;
  public String rQi;
  public String rQj;
  public String rQk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.lRl == null) {
        throw new b("Not all required fields were included: product_id");
      }
      if (this.lPj == null) {
        throw new b("Not all required fields were included: price");
      }
      if (this.rFe == null) {
        throw new b("Not all required fields were included: currency_type");
      }
      if (this.rQh == null) {
        throw new b("Not all required fields were included: session_data");
      }
      if (this.lRl != null) {
        paramVarArgs.g(1, this.lRl);
      }
      if (this.lPj != null) {
        paramVarArgs.g(2, this.lPj);
      }
      if (this.rFe != null) {
        paramVarArgs.g(3, this.rFe);
      }
      if (this.rQh != null) {
        paramVarArgs.g(4, this.rQh);
      }
      if (this.rQi != null) {
        paramVarArgs.g(5, this.rQi);
      }
      if (this.rQj != null) {
        paramVarArgs.g(6, this.rQj);
      }
      if (this.rQk != null) {
        paramVarArgs.g(7, this.rQk);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.lRl == null) {
        break label649;
      }
    }
    label649:
    for (int i = f.a.a.b.b.a.h(1, this.lRl) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.lPj);
      }
      i = paramInt;
      if (this.rFe != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rFe);
      }
      paramInt = i;
      if (this.rQh != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rQh);
      }
      i = paramInt;
      if (this.rQi != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rQi);
      }
      paramInt = i;
      if (this.rQj != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rQj);
      }
      i = paramInt;
      if (this.rQk != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rQk);
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
        if (this.lRl == null) {
          throw new b("Not all required fields were included: product_id");
        }
        if (this.lPj == null) {
          throw new b("Not all required fields were included: price");
        }
        if (this.rFe == null) {
          throw new b("Not all required fields were included: currency_type");
        }
        if (this.rQh != null) {
          break;
        }
        throw new b("Not all required fields were included: session_data");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        anm localanm = (anm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localanm.lRl = locala.vHC.readString();
          return 0;
        case 2: 
          localanm.lPj = locala.vHC.readString();
          return 0;
        case 3: 
          localanm.rFe = locala.vHC.readString();
          return 0;
        case 4: 
          localanm.rQh = locala.vHC.readString();
          return 0;
        case 5: 
          localanm.rQi = locala.vHC.readString();
          return 0;
        case 6: 
          localanm.rQj = locala.vHC.readString();
          return 0;
        }
        localanm.rQk = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/anm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */