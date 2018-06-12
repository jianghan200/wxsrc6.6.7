package com.tencent.mm.plugin.product.c;

public final class h
  extends com.tencent.mm.bk.a
{
  public String id;
  public boolean lRP;
  public String name;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.id != null) {
        paramVarArgs.g(1, this.id);
      }
      if (this.name != null) {
        paramVarArgs.g(2, this.name);
      }
      paramVarArgs.av(3, this.lRP);
      return 0;
    }
    if (paramInt == 1) {
      if (this.id == null) {
        break label266;
      }
    }
    label266:
    for (paramInt = f.a.a.b.b.a.h(1, this.id) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.name != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.name);
      }
      return i + (f.a.a.b.b.a.ec(3) + 1);
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
        h localh = (h)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localh.id = locala.vHC.readString();
          return 0;
        case 2: 
          localh.name = locala.vHC.readString();
          return 0;
        }
        localh.lRP = locala.cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/product/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */