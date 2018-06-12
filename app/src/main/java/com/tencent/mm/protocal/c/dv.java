package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class dv
  extends com.tencent.mm.bk.a
{
  public String bLe;
  public String ebR;
  public String reg;
  public LinkedList<String> reh = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.reg == null) {
        throw new b("Not all required fields were included: roomname");
      }
      if (this.reg != null) {
        paramVarArgs.g(1, this.reg);
      }
      if (this.bLe != null) {
        paramVarArgs.g(2, this.bLe);
      }
      if (this.ebR != null) {
        paramVarArgs.g(3, this.ebR);
      }
      paramVarArgs.d(4, 1, this.reh);
      return 0;
    }
    if (paramInt == 1) {
      if (this.reg == null) {
        break label372;
      }
    }
    label372:
    for (int i = f.a.a.b.b.a.h(1, this.reg) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bLe != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bLe);
      }
      i = paramInt;
      if (this.ebR != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.ebR);
      }
      return i + f.a.a.a.c(4, 1, this.reh);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.reh.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.reg != null) {
          break;
        }
        throw new b("Not all required fields were included: roomname");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        dv localdv = (dv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localdv.reg = locala.vHC.readString();
          return 0;
        case 2: 
          localdv.bLe = locala.vHC.readString();
          return 0;
        case 3: 
          localdv.ebR = locala.vHC.readString();
          return 0;
        }
        localdv.reh.add(locala.vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */