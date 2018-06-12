package com.tencent.mm.protocal.c;

public final class bnh
  extends com.tencent.mm.bk.a
{
  public String content;
  public String slj;
  public String slk;
  public String sll;
  public String slm;
  public int sln;
  public int state;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.content != null) {
        paramVarArgs.g(1, this.content);
      }
      if (this.slj != null) {
        paramVarArgs.g(2, this.slj);
      }
      if (this.slk != null) {
        paramVarArgs.g(3, this.slk);
      }
      if (this.sll != null) {
        paramVarArgs.g(4, this.sll);
      }
      if (this.slm != null) {
        paramVarArgs.g(5, this.slm);
      }
      paramVarArgs.fT(6, this.sln);
      paramVarArgs.fT(7, this.state);
      return 0;
    }
    if (paramInt == 1) {
      if (this.content == null) {
        break label477;
      }
    }
    label477:
    for (int i = f.a.a.b.b.a.h(1, this.content) + 0;; i = 0)
    {
      paramInt = i;
      if (this.slj != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.slj);
      }
      i = paramInt;
      if (this.slk != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.slk);
      }
      paramInt = i;
      if (this.sll != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sll);
      }
      i = paramInt;
      if (this.slm != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.slm);
      }
      return i + f.a.a.a.fQ(6, this.sln) + f.a.a.a.fQ(7, this.state);
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
        bnh localbnh = (bnh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbnh.content = locala.vHC.readString();
          return 0;
        case 2: 
          localbnh.slj = locala.vHC.readString();
          return 0;
        case 3: 
          localbnh.slk = locala.vHC.readString();
          return 0;
        case 4: 
          localbnh.sll = locala.vHC.readString();
          return 0;
        case 5: 
          localbnh.slm = locala.vHC.readString();
          return 0;
        case 6: 
          localbnh.sln = locala.vHC.rY();
          return 0;
        }
        localbnh.state = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bnh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */