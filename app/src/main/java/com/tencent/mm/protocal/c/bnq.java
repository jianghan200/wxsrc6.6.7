package com.tencent.mm.protocal.c;

public final class bnq
  extends com.tencent.mm.bk.a
{
  public int actionType;
  public String bSc;
  public String hwC;
  public String id;
  public long slJ;
  public String title;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.id != null) {
        paramVarArgs.g(1, this.id);
      }
      if (this.bSc != null) {
        paramVarArgs.g(2, this.bSc);
      }
      paramVarArgs.T(3, this.slJ);
      paramVarArgs.fT(4, this.actionType);
      if (this.url != null) {
        paramVarArgs.g(5, this.url);
      }
      if (this.title != null) {
        paramVarArgs.g(6, this.title);
      }
      if (this.hwC != null) {
        paramVarArgs.g(7, this.hwC);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.id == null) {
        break label477;
      }
    }
    label477:
    for (paramInt = f.a.a.b.b.a.h(1, this.id) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bSc != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bSc);
      }
      i = i + f.a.a.a.S(3, this.slJ) + f.a.a.a.fQ(4, this.actionType);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.url);
      }
      i = paramInt;
      if (this.title != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.title);
      }
      paramInt = i;
      if (this.hwC != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.hwC);
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
        bnq localbnq = (bnq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbnq.id = locala.vHC.readString();
          return 0;
        case 2: 
          localbnq.bSc = locala.vHC.readString();
          return 0;
        case 3: 
          localbnq.slJ = locala.vHC.rZ();
          return 0;
        case 4: 
          localbnq.actionType = locala.vHC.rY();
          return 0;
        case 5: 
          localbnq.url = locala.vHC.readString();
          return 0;
        case 6: 
          localbnq.title = locala.vHC.readString();
          return 0;
        }
        localbnq.hwC = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bnq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */