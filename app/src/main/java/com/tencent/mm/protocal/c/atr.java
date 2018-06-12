package com.tencent.mm.protocal.c;

public final class atr
  extends com.tencent.mm.bk.a
{
  public String desc;
  public String huW;
  public String path;
  public String title;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.huW != null) {
        paramVarArgs.g(1, this.huW);
      }
      if (this.title != null) {
        paramVarArgs.g(2, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.g(3, this.desc);
      }
      if (this.username != null) {
        paramVarArgs.g(4, this.username);
      }
      if (this.path != null) {
        paramVarArgs.g(5, this.path);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.huW == null) {
        break label399;
      }
    }
    label399:
    for (int i = f.a.a.b.b.a.h(1, this.huW) + 0;; i = 0)
    {
      paramInt = i;
      if (this.title != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.title);
      }
      i = paramInt;
      if (this.desc != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.desc);
      }
      paramInt = i;
      if (this.username != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.username);
      }
      i = paramInt;
      if (this.path != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.path);
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
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        atr localatr = (atr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localatr.huW = locala.vHC.readString();
          return 0;
        case 2: 
          localatr.title = locala.vHC.readString();
          return 0;
        case 3: 
          localatr.desc = locala.vHC.readString();
          return 0;
        case 4: 
          localatr.username = locala.vHC.readString();
          return 0;
        }
        localatr.path = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */