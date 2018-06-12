package com.tencent.mm.protocal.c;

public final class alp
  extends com.tencent.mm.bk.a
{
  public String bWP;
  public String rOd;
  public String rOe;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rOd != null) {
        paramVarArgs.g(1, this.rOd);
      }
      if (this.rOe != null) {
        paramVarArgs.g(2, this.rOe);
      }
      if (this.url != null) {
        paramVarArgs.g(3, this.url);
      }
      if (this.bWP != null) {
        paramVarArgs.g(4, this.bWP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rOd == null) {
        break label344;
      }
    }
    label344:
    for (int i = f.a.a.b.b.a.h(1, this.rOd) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rOe != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rOe);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.url);
      }
      paramInt = i;
      if (this.bWP != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.bWP);
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
        alp localalp = (alp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localalp.rOd = locala.vHC.readString();
          return 0;
        case 2: 
          localalp.rOe = locala.vHC.readString();
          return 0;
        case 3: 
          localalp.url = locala.vHC.readString();
          return 0;
        }
        localalp.bWP = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/alp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */