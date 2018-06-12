package com.tencent.mm.protocal.c;

public final class aea
  extends com.tencent.mm.bk.a
{
  public String gmb;
  public String lMY;
  public String path;
  public String title;
  public int type;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.lMY != null) {
        paramVarArgs.g(1, this.lMY);
      }
      if (this.title != null) {
        paramVarArgs.g(2, this.title);
      }
      paramVarArgs.fT(3, this.type);
      if (this.gmb != null) {
        paramVarArgs.g(4, this.gmb);
      }
      if (this.username != null) {
        paramVarArgs.g(5, this.username);
      }
      if (this.path != null) {
        paramVarArgs.g(6, this.path);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.lMY == null) {
        break label438;
      }
    }
    label438:
    for (paramInt = f.a.a.b.b.a.h(1, this.lMY) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.title != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.title);
      }
      i += f.a.a.a.fQ(3, this.type);
      paramInt = i;
      if (this.gmb != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.gmb);
      }
      i = paramInt;
      if (this.username != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.username);
      }
      paramInt = i;
      if (this.path != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.path);
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
        aea localaea = (aea)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaea.lMY = locala.vHC.readString();
          return 0;
        case 2: 
          localaea.title = locala.vHC.readString();
          return 0;
        case 3: 
          localaea.type = locala.vHC.rY();
          return 0;
        case 4: 
          localaea.gmb = locala.vHC.readString();
          return 0;
        case 5: 
          localaea.username = locala.vHC.readString();
          return 0;
        }
        localaea.path = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */