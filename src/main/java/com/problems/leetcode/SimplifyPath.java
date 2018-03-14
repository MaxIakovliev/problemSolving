package com.problems.leetcode;

import java.util.Stack;
import java.util.regex.Pattern;

/**
 * Created by Maks on 3/14/2018.
 */
public class SimplifyPath {
    public String simplifyPath(String path) {

        Stack<String> stack=new Stack<>();
        String[] splt=path.split(Pattern.quote("/"));
        for(String s :splt){
            if (wrongdot(s)) {
                if (path.charAt(path.length() - 1) == '/')
                    return path.substring(0, path.length() - 1);
                return path;
            }

            if (s.toString().equals("."))
                continue;
            if (s.toString().equals("..") && stack.size()>0)
                stack.pop();

            else if (s.length()>0 && !s.toString().equals(".."))
                stack.push(s);
        }
        StringBuilder sb=new StringBuilder();
        while(stack.size()>0){
            if(sb.length()>0)
                sb.insert(0,"/");
            sb.insert(0,stack.pop());
        }
        return  "/"+sb.toString();
    }

    public String simplifyPath2(String path) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/' && i + 3 < path.length()
                    && path.charAt(i + 1) == '.' && path.charAt(i + 2) == '.' && path.charAt(i + 3) == '.') {
                if (path.charAt(path.length() - 1) == '/')
                    return path.substring(0, path.length() - 1);
                return path;
            } else if (path.charAt(i) == '/' && i + 1 < path.length() && path.charAt(i + 1) == '/') {
                i++;
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) != '/')
                    sb.append('/');
            } else if (path.charAt(i) == '.' && i + 1 < path.length()
                    && path.charAt(i + 1) == '/' && i > 0 && path.charAt(i - 1) == '/') {
                i++;
            } else if (path.charAt(i) == '/' && i + 2 < path.length()
                    && path.charAt(i + 1) == '.' && path.charAt(i + 2) == '/') {
                i++;
            } else if (path.charAt(i) == '/' && i + 2 < path.length()
                    && path.charAt(i + 1) == '.' && path.charAt(i + 2) == '.') {

                if (i + 3 < path.length() && path.charAt(i + 3) != '/') {
                    if (path.charAt(path.length() - 1) == '/')
                        return path.substring(0, path.length() - 1);
                    return path;
                }

                i += 2;
                while (sb.length() > 1 && sb.charAt(sb.length() - 1) != '/') {
                    sb.deleteCharAt(sb.length() - 1);
                }
                if (sb.length() > 1 && sb.charAt(sb.length() - 1) == '/') {
                    sb.deleteCharAt(sb.length() - 1);
                }
                if (sb.length() == 0)
                    sb.append("/");
            } else {
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '/' && path.charAt(i) == '/') {
                    continue;
                }

                sb.append(path.charAt(i));
            }

        }
        if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == '.' && sb.charAt(sb.length() - 2) == '/') {
            if (sb.length() > 2 && sb.charAt(sb.length() - 1) == '.' && sb.charAt(sb.length() - 2) == '/') {
                return sb.substring(0, sb.length() - 2).toString();

            }
            return sb.substring(0, sb.length() - 1).toString();
        }

        if (sb.length() > 1 && sb.charAt(sb.length() - 1) == '/')
            return sb.substring(0, sb.length() - 1);
        return sb.toString();
    }
    private boolean wrongdot(String s){
        if (s.length()>=3 && s.charAt(0)=='.' && s.charAt(1)=='.' && s.charAt(2)=='.')
            return true;
        return false;
    }

    public static void main(String[] args) {
        SimplifyPath sp=new SimplifyPath();
        System.out.println(sp.simplifyPath("/home//foo/"));
        System.out.println(sp.simplifyPath("/abc/..."));
        System.out.println(sp.simplifyPath("/.../"));
        System.out.println(sp.simplifyPath("/"));
        System.out.println(sp.simplifyPath("/.."));
        System.out.println(sp.simplifyPath("/home/"));
        System.out.println(sp.simplifyPath("/a/./b/../../c/"));
    }
}
