package com.tencent.mm.protocal.b.a;

public final class d
  extends com.tencent.mm.bk.a
{
  public String bOX;
  public int bXP;
  public String desc;
  public String jap;
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.g(2, this.desc);
      }
      if (this.bOX != null) {
        paramVarArgs.g(3, this.bOX);
      }
      paramVarArgs.fT(4, this.bXP);
      if (this.jap != null) {
        paramVarArgs.g(5, this.jap);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label383;
      }
    }
    label383:
    for (int i = f.a.a.b.b.a.h(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.desc);
      }
      i = paramInt;
      if (this.bOX != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bOX);
      }
      i += f.a.a.a.fQ(4, this.bXP);
      paramInt = i;
      if (this.jap != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.jap);
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
        d locald = (d)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          locald.title = locala.vHC.readString();
          return 0;
        case 2: 
          locald.desc = locala.vHC.readString();
          return 0;
        case 3: 
          locald.bOX = locala.vHC.readString();
          return 0;
        case 4: 
          locald.bXP = locala.vHC.rY();
          return 0;
        }
        locald.jap = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/b/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */