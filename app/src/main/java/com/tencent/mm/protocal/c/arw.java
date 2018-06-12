package com.tencent.mm.protocal.c;

public final class arw
  extends com.tencent.mm.bk.a
{
  public String rUs;
  public String rUt;
  public String rUu;
  public int rqN;
  public String type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rUs != null) {
        paramVarArgs.g(1, this.rUs);
      }
      if (this.rUt != null) {
        paramVarArgs.g(2, this.rUt);
      }
      if (this.type != null) {
        paramVarArgs.g(3, this.type);
      }
      paramVarArgs.fT(4, this.rqN);
      if (this.rUu != null) {
        paramVarArgs.g(5, this.rUu);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rUs == null) {
        break label383;
      }
    }
    label383:
    for (int i = f.a.a.b.b.a.h(1, this.rUs) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rUt != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rUt);
      }
      i = paramInt;
      if (this.type != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.type);
      }
      i += f.a.a.a.fQ(4, this.rqN);
      paramInt = i;
      if (this.rUu != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rUu);
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
        arw localarw = (arw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localarw.rUs = locala.vHC.readString();
          return 0;
        case 2: 
          localarw.rUt = locala.vHC.readString();
          return 0;
        case 3: 
          localarw.type = locala.vHC.readString();
          return 0;
        case 4: 
          localarw.rqN = locala.vHC.rY();
          return 0;
        }
        localarw.rUu = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/arw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */