package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class wc
  extends com.tencent.mm.bk.a
{
  public String appId;
  public String bGy;
  public String bSS;
  public wl bXO;
  public String desc;
  public String rBs;
  public LinkedList<String> rBt = new LinkedList();
  public String title;
  public int type;
  
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
      if (this.bSS != null) {
        paramVarArgs.g(3, this.bSS);
      }
      if (this.rBs != null) {
        paramVarArgs.g(4, this.rBs);
      }
      if (this.appId != null) {
        paramVarArgs.g(5, this.appId);
      }
      if (this.bGy != null) {
        paramVarArgs.g(6, this.bGy);
      }
      paramVarArgs.d(7, 1, this.rBt);
      paramVarArgs.fT(8, this.type);
      if (this.bXO != null)
      {
        paramVarArgs.fV(9, this.bXO.boi());
        this.bXO.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label701;
      }
    }
    label701:
    for (int i = f.a.a.b.b.a.h(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.desc);
      }
      i = paramInt;
      if (this.bSS != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bSS);
      }
      paramInt = i;
      if (this.rBs != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rBs);
      }
      i = paramInt;
      if (this.appId != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.appId);
      }
      paramInt = i;
      if (this.bGy != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.bGy);
      }
      i = paramInt + f.a.a.a.c(7, 1, this.rBt) + f.a.a.a.fQ(8, this.type);
      paramInt = i;
      if (this.bXO != null) {
        paramInt = i + f.a.a.a.fS(9, this.bXO.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rBt.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        wc localwc = (wc)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localwc.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localwc.desc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localwc.bSS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localwc.rBs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localwc.appId = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localwc.bGy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localwc.rBt.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 8: 
          localwc.type = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new wl();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((wl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localwc.bXO = ((wl)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/wc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */