package com.tencent.mm.protocal.c;

public final class anj
  extends com.tencent.mm.bk.a
{
  public String desc;
  public String rPX;
  public String rPY;
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
      if (this.rPX != null) {
        paramVarArgs.g(3, this.rPX);
      }
      if (this.rPY != null) {
        paramVarArgs.g(4, this.rPY);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label344;
      }
    }
    label344:
    for (int i = f.a.a.b.b.a.h(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.desc);
      }
      i = paramInt;
      if (this.rPX != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rPX);
      }
      paramInt = i;
      if (this.rPY != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rPY);
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
        anj localanj = (anj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localanj.title = locala.vHC.readString();
          return 0;
        case 2: 
          localanj.desc = locala.vHC.readString();
          return 0;
        case 3: 
          localanj.rPX = locala.vHC.readString();
          return 0;
        }
        localanj.rPY = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/anj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */