package com.tencent.mm.plugin.qqmail.b;

import f.a.a.b;

public final class y
  extends com.tencent.mm.bk.a
{
  public long mea;
  public String meb;
  public String name;
  public String path;
  public long size;
  public int state;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.path == null) {
        throw new b("Not all required fields were included: path");
      }
      if (this.name == null) {
        throw new b("Not all required fields were included: name");
      }
      if (this.path != null) {
        paramVarArgs.g(1, this.path);
      }
      if (this.name != null) {
        paramVarArgs.g(2, this.name);
      }
      paramVarArgs.T(3, this.size);
      paramVarArgs.fT(4, this.state);
      paramVarArgs.T(5, this.mea);
      if (this.meb != null) {
        paramVarArgs.g(6, this.meb);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.path == null) {
        break label470;
      }
    }
    label470:
    for (paramInt = f.a.a.b.b.a.h(1, this.path) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.name != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.name);
      }
      i = i + f.a.a.a.S(3, this.size) + f.a.a.a.fQ(4, this.state) + f.a.a.a.S(5, this.mea);
      paramInt = i;
      if (this.meb != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.meb);
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
        if (this.path == null) {
          throw new b("Not all required fields were included: path");
        }
        if (this.name != null) {
          break;
        }
        throw new b("Not all required fields were included: name");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        y localy = (y)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localy.path = locala.vHC.readString();
          return 0;
        case 2: 
          localy.name = locala.vHC.readString();
          return 0;
        case 3: 
          localy.size = locala.vHC.rZ();
          return 0;
        case 4: 
          localy.state = locala.vHC.rY();
          return 0;
        case 5: 
          localy.mea = locala.vHC.rZ();
          return 0;
        }
        localy.meb = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */