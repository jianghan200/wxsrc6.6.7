package com.tencent.mm.protocal.c;

public final class aze
  extends com.tencent.mm.bk.a
{
  public String mPv;
  public long sbV;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.mPv != null) {
        paramVarArgs.g(1, this.mPv);
      }
      paramVarArgs.T(2, this.sbV);
      if (this.url != null) {
        paramVarArgs.g(3, this.url);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.mPv == null) {
        break label273;
      }
    }
    label273:
    for (paramInt = f.a.a.b.b.a.h(1, this.mPv) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.sbV);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.url);
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
        aze localaze = (aze)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaze.mPv = locala.vHC.readString();
          return 0;
        case 2: 
          localaze.sbV = locala.vHC.rZ();
          return 0;
        }
        localaze.url = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/aze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */