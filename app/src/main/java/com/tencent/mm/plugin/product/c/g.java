package com.tencent.mm.plugin.product.c;

public final class g
  extends com.tencent.mm.bk.a
{
  public String country;
  public String csK;
  public String csL;
  public String dRH;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.country != null) {
        paramVarArgs.g(1, this.country);
      }
      if (this.csK != null) {
        paramVarArgs.g(2, this.csK);
      }
      if (this.csL != null) {
        paramVarArgs.g(3, this.csL);
      }
      if (this.dRH != null) {
        paramVarArgs.g(4, this.dRH);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.country == null) {
        break label344;
      }
    }
    label344:
    for (int i = f.a.a.b.b.a.h(1, this.country) + 0;; i = 0)
    {
      paramInt = i;
      if (this.csK != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.csK);
      }
      i = paramInt;
      if (this.csL != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.csL);
      }
      paramInt = i;
      if (this.dRH != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.dRH);
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
        g localg = (g)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localg.country = locala.vHC.readString();
          return 0;
        case 2: 
          localg.csK = locala.vHC.readString();
          return 0;
        case 3: 
          localg.csL = locala.vHC.readString();
          return 0;
        }
        localg.dRH = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/product/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */